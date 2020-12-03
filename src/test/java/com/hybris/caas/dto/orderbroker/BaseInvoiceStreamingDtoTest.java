package com.hybris.caas.dto.orderbroker;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.hybris.caas.dto.invoice.InvoiceHeaderDto;
import com.hybris.caas.generic.utils.ClassUtil;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaseInvoiceStreamingDtoTest {
    @Test
    public void streamoutInvoiceSchema() throws JsonProcessingException {
        List<Class<?>> classes = new ArrayList<>();
        JsonNode root = ClassUtil.prepareClassHierarchy(InvoiceHeaderDto.class, true, classes);
        try(final FileWriter fileWriter = new FileWriter("InvoiceHeaderDto.class.json")){
            fileWriter.write(root.toPrettyString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
