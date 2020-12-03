package com.hybris.caas.generic.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class ClassUtil {

    static ObjectMapper mapper = new ObjectMapper() {
        {
            this.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        }
    };

    /**
     * Generate primitive fields of rootClass and add currentLevel and sorted in lexicographic order
     * @param rootClass
     * @param <T>
     * @return
     */
    static <T> void singleAncestorClassHierarchy(Class<T> rootClass, ObjectNode upNode,
                                                 List<Class<?>> classes) {
        List<Class<?>> retClasses = classes;
        if (rootClass == null){
            return;
        }
        if (rootClass.isPrimitive()
                || rootClass.isEnum()
                || rootClass.getTypeName().startsWith("java.util.Date")
                || rootClass.getTypeName().startsWith("java.time.")
                || rootClass.getTypeName().startsWith("java.lang.")
                || rootClass.getTypeName().startsWith("java.math.")){
            if(!rootClass.getTypeName().equals("java.lang.Object")) {
                upNode.put("type", rootClass.getTypeName());
            }
        }
        else {
            if (rootClass.getSuperclass() != null && !rootClass.getSuperclass().isPrimitive()) {
                singleAncestorClassHierarchy(rootClass.getSuperclass(), upNode, retClasses);
            }
            retClasses.add(rootClass);
            for (Field field : rootClass.getDeclaredFields()) {
                //see: eliminate the self-loop
                if (!field.getName().equals("this$0")) {
                    processSingleField(field, upNode, classes);
                }
            }
        }
    }

    private static void processSingleField(Field field, ObjectNode upNode,
                                           List<Class<?>> classes) {
        if (field.getType().isPrimitive()
                || field.getType().isEnum()
                || field.getType().getTypeName().startsWith("java.util.Date")
                || field.getType().getTypeName().startsWith("java.time.")
                || field.getType().getTypeName().startsWith("java.lang.")
                || field.getType().getTypeName().startsWith("java.math.")){
            upNode.put(field.getName(), field.getType().getTypeName());
        }
        else if (field.getType().isArray()
                || Collection.class.isAssignableFrom(field.getType())) {
            ArrayNode arrayNode = mapper.createArrayNode();
            upNode.put(field.getName(), arrayNode);
            ObjectNode childNode = mapper.createObjectNode();
            arrayNode.add(childNode);
            if (field.getGenericType() instanceof ParameterizedType) {
                ParameterizedType aType = (ParameterizedType) field.getGenericType();
                Type[] fieldArgTypes = aType.getActualTypeArguments();
                for(Type fieldArgType : fieldArgTypes){
                    Class fieldArgClass = (Class) fieldArgType;
                    singleAncestorClassHierarchy(fieldArgClass, childNode, classes);
                }
            }
            else {
                singleAncestorClassHierarchy(field.getType().getComponentType(), childNode, classes);
            }
        }
        else {
            if (!field.getType().isInterface()) {
                ObjectNode childNode = mapper.createObjectNode();
                //composite type
                upNode.put(field.getName(), childNode);
                singleAncestorClassHierarchy(field.getType(), childNode, classes);
            }
        }
    }
    /**
     * dynamic search and generate class hierarchy
     * @param rootClass
     * @param <T>
     * @return
     */
    public static <T> JsonNode prepareClassHierarchy(Class<T> rootClass, boolean sorted, List<Class<?>> classes) throws JsonProcessingException {
        ObjectNode root = mapper.createObjectNode();
        singleAncestorClassHierarchy(rootClass, root, classes);
        ObjectMapper objectMapper = new ObjectMapper() {
            {
                this.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, sorted);
//                this.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, sorted);
//                this.configure(SerializationFeature.INDENT_OUTPUT, sorted);
            }
        };
        return objectMapper.readTree(objectMapper.writeValueAsString(root));
    }

    private static Set<Class<?>> listCompositeClass(Class<?> clz) throws ClassNotFoundException {
        final Set<Class<?>> compositeCls = new HashSet<>();
        for (Field field : clz.getDeclaredFields()) {
            if (field.getType().getPackageName().contains("com.hybris.caas")) {
                compositeCls.add(field.getType());
            }
            if (field.getType().getTypeName().contains("java.util.Set") || field.getType().getTypeName().contains("java.util.List")) {
                compositeCls.add(Class.forName(((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0].getTypeName()));
            }
        }
        for (; clz.getSuperclass() != null; clz = clz.getSuperclass()) {
            for (Field field : clz.getDeclaredFields()) {
                if (field.getType().getPackageName().contains("com.hybris.caas")) {
                    compositeCls.add(field.getType());
                }
                if (field.getType().getTypeName().contains("java.util.Set") || field.getType().getTypeName().contains("java" +
                        ".util.List")) {
                    compositeCls.add(Class.forName(((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0].getTypeName()));
                }
            }
        }
        return compositeCls;
    }

    public static Set<String> extractIngoredPropertiesOnCls(Class<?> baseCls) throws ClassNotFoundException {
        final Set<Class<?>> compositeCls = listCompositeClass(baseCls);
        final Set<String> ignoredProperties = new HashSet<>();
        for (Class<?> cls : compositeCls) {
            final JavaType javaType = mapper.getTypeFactory().constructType(cls);
            final BeanDescription beanDescription = mapper.getSerializationConfig().introspect(javaType);
            ignoredProperties.addAll(mapper.getSerializationConfig().getAnnotationIntrospector()
                    .findPropertyIgnorals(beanDescription.getClassInfo()).getIgnored());
        }
        return ignoredProperties;
    }
}

