package com.hybris.caas.dto.orderbroker.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class CustomDeserializer extends StdDeserializer<BaseClass> {
    public CustomDeserializer() {
        super(BaseClass.class);
    }

    @Override
    public BaseClass deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        TreeNode node = p.readValueAsTree();
        // Select the concrete class based on the existence of a property
        if (node.get("classAProp") != null) {
            return p.getCodec().treeToValue(node, ClassA.class);
        }
        return p.getCodec().treeToValue(node, ClassB.class);
    }
}
