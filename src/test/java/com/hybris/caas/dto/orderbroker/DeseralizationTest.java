package com.hybris.caas.dto.orderbroker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.hybris.caas.dto.order.payment.PaymentCardDto;
import com.hybris.caas.dto.order.enums.PaymentCardType;
import com.hybris.caas.dto.orderbroker.serializer.BaseClass;
import com.hybris.caas.dto.orderbroker.serializer.ClassA;
import com.hybris.caas.dto.orderbroker.serializer.ClassB;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.fasterxml.jackson.databind.DeserializationFeature.READ_ENUMS_USING_TO_STRING;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
import static org.junit.Assert.assertEquals;

public class DeseralizationTest {

    /**
     * How to avoid precision loss in ObjectMapper, refer to https://github.com/FasterXML/jackson-databind/issues/2087
     * @throws JsonProcessingException
     */
    @Test
    public void testBigDecimalTest() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        mapper = mapper.setNodeFactory(JsonNodeFactory.withExactBigDecimals(true));
        Random random = new Random();
        for (int i= 1; i < 10000; i++) {
            Random rand = new Random();
            float result = (float) ((rand.nextInt(201) - 100) / 100.0);
            BigDecimal value = new BigDecimal(result);
            String rawString = value.toPlainString();
            var x = mapper.readTree(rawString);
            assertEquals(x.decimalValue().scale(), value.scale());
            assertEquals(mapper.writeValueAsString(x), rawString);
        }
    }

    @Test
    public void testEnumTest() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
        mapper.configure(WRITE_ENUMS_USING_TO_STRING, true);
        mapper.configure(READ_ENUMS_USING_TO_STRING, true);
        mapper = mapper.setNodeFactory(JsonNodeFactory.withExactBigDecimals(true));
        String jsonPayload = mapper.writeValueAsString(new PaymentCardDto(){
            {
                this.setCardType(PaymentCardType.CREDIT_CARD);
            }
        });
        final PaymentCardDto instance = mapper.readValue(jsonPayload, PaymentCardDto.class);
        String deserializePayload = mapper.writeValueAsString(instance);
        assertEquals(jsonPayload, deserializePayload);
    }

    static JsonMapper mapper                    = new JsonMapper();

    static {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    @Test
    public void testEqual() throws JsonProcessingException {
        final List<BaseClass> group = Arrays.asList(new ClassA("a"), new ClassB("b"));
        final String json = mapper.writeValueAsString(group);
        final List<BaseClass> clonedGroup = mapper.readValue(json, new TypeReference<>() {
        });
        assertEquals("value of group and clonedGroup should be equal", group, clonedGroup);
    }

}
