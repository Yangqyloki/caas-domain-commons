package com.hybris.caas.dto.orderbroker;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.common.collect.Lists;
import com.hybris.caas.dto.order.BaseOrderDto;
import com.hybris.caas.dto.order.BaseOrderEmailDto;
import com.hybris.caas.dto.order.division.DivisionDto;
import com.hybris.caas.dto.order.enums.PaymentMethod;
import com.hybris.caas.dto.order.payment.PaymentDto;
import com.hybris.caas.generic.utils.ClassUtil;
import com.hybris.caas.dto.order.orderline.BaseOrderLineStreamingDto;
import com.hybris.caas.dto.order.BaseOrderStreamingDto;
import org.apache.commons.collections.IteratorUtils;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.*;

import static org.junit.Assert.assertFalse;

public class OrderStreamingDtoTest {

    @Test
    public void streamoutOrderSchema() throws JsonProcessingException {
        List<Class<?>> classes = new ArrayList<>();
        JsonNode root = ClassUtil.prepareClassHierarchy(BaseOrderStreamingDto.class, true, classes);
        try (final FileWriter fileWriter = new FileWriter("BaseOrderStreamingDto.class.json")) {
            fileWriter.write(root.toPrettyString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static JsonMapper mapper = JsonMapper.builder()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true)
            .configure(JsonWriteFeature.WRITE_NUMBERS_AS_STRINGS, true).build();

    @Test
    public void streamoutBaseOrderEmailDtoWithLine() throws JsonProcessingException {
        List<Class<?>> classes = new ArrayList<>();
        JsonNode root = ClassUtil.prepareClassHierarchy(BaseOrderEmailDto.class, true, classes);
        try (final FileWriter fileWriter = new FileWriter("BaseOrderEmailDto.class.json")) {
            final Object obj = mapper.treeToValue(root, Object.class);
            fileWriter.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void streamoutBaseOrderDto() throws JsonProcessingException {
        List<Class<?>> classes = new ArrayList<>();
        JsonNode root = ClassUtil.prepareClassHierarchy(BaseOrderDto.class, true, classes);
        try (final FileWriter fileWriter = new FileWriter("BaseOrderDto.class.json")) {
            final Object obj = mapper.treeToValue(root, Object.class);
            fileWriter.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * for check type
     * @param node
     * @param ignoredProperties
     */
    void checkField(final JsonNode node, final Set<String> ignoredProperties) {
        for (JsonNode element : Lists.newArrayList(node.elements())) {
            if (element.isContainerNode()) {
                if (element.isArray()) {
                    for(JsonNode subElement: element) {
                        checkField(subElement, ignoredProperties);
                    }
                }
                else{
                    checkField(element, ignoredProperties);
                }
            }
            else {
                Lists.newArrayList(element.fieldNames()).forEach(fieldName ->{
                    assertFalse(ignoredProperties.contains(fieldName));
                });
            }
        }
    }

    @Test
    public void streamoutBaseOrderEmailDto() throws ClassNotFoundException, JsonProcessingException {
        final Set<String> ignoredProperties = ClassUtil.extractIngoredPropertiesOnCls(BaseOrderEmailDto.class);
        JsonNode root = mapper.readValue(mapper.writeValueAsString(new BaseOrderEmailDto() {
            {
                this.setPayment(new PaymentDto() {
                    {
                        this.setAuthorizedAmount(new BigDecimal(10.0));
                        this.setCreditCardStatus("Already cancelled");
                        this.setPaymentMethod(PaymentMethod.APPLE_PAY);
                    }
                });
                this.setDivisions(Arrays.asList(new DivisionDto("I1", "U1")));
            }
        }), JsonNode.class);
        checkField(root, ignoredProperties);
    }

    @Test
    public void streamoutOrderLineSchema() throws JsonProcessingException {
        List<Class<?>> classes = new ArrayList<>();
        JsonNode root = ClassUtil.prepareClassHierarchy(BaseOrderLineStreamingDto.class, true, classes);
        try (final FileWriter fileWriter = new FileWriter("BaseOrderLineStreamingDto.class.json")) {
            fileWriter.write(root.toPrettyString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

