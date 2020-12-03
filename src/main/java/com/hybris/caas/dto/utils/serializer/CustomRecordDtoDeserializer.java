package com.hybris.caas.dto.utils.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.hybris.caas.dto.order.enums.RecordType;
import com.hybris.caas.dto.order.orderline.records.RecordDto;
import com.hybris.caas.dto.order.orderline.records.ReturnRecordDto;
import com.hybris.caas.order.dto.order.cancel.CancellationRecordDto;
import com.hybris.caas.order.dto.order.returns.MispickRecordDto;
import com.hybris.caas.order.dto.order.returns.SkipRecordDto;

import java.io.IOException;
import java.io.InvalidClassException;

/**
 * For customization for json deserializer.
 *
 * @Author Orlando, Ding
 * @Since Oct 22th, 2020
 * @Version 1.0
 */
public class CustomRecordDtoDeserializer extends StdDeserializer<RecordDto> {
    public CustomRecordDtoDeserializer() {
        super(RecordDto.class);
    }

    @Override
    public RecordDto deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        TreeNode node = p.readValueAsTree();
        // Select the concrete class based on the existence of a property
        final String recordType = ((JsonNode)node.get("type")).asText();
        final RecordType type = RecordType.valueOf(recordType);
        switch (type){
            case RETURN:
                return p.getCodec().treeToValue(node, ReturnRecordDto.class);
            case SKIP:
                return p.getCodec().treeToValue(node, SkipRecordDto.class);
            case CANCELLATION:
                return p.getCodec().treeToValue(node, CancellationRecordDto.class);
            case MISPICK:
                return p.getCodec().treeToValue(node, MispickRecordDto.class);
            default:
                throw new InvalidClassException("Invalid RecordDto Type for deserialization");
        }
    }
}