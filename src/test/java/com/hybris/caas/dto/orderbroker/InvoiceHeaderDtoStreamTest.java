package com.hybris.caas.dto.orderbroker;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.hybris.caas.dto.invoice.InvoiceDetailDto;
import com.hybris.caas.dto.invoice.InvoiceHeaderDto;
import com.hybris.caas.dto.invoice.enums.InvoiceDetailType;
import com.hybris.caas.dto.invoice.enums.InvoiceStatus;
import com.hybris.caas.dto.order.discount.DiscountDto;
import com.hybris.caas.dto.order.discount.DiscountRecordDto;
import com.hybris.caas.dto.order.enums.PromoLevel;
import com.hybris.caas.dto.order.enums.PromoType;
import com.hybris.caas.dto.order.enums.promotion.DiscountType;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class InvoiceHeaderDtoStreamTest {

    @Test
    public void testStreamInvoiceData() throws JsonProcessingException {
        InvoiceHeaderDto invoiceHeaderDto = new InvoiceHeaderDto();
        invoiceHeaderDto.setInvoiceId("123");
        invoiceHeaderDto.setOrderId("123");
        invoiceHeaderDto.setInvoiceStatus(InvoiceStatus.CREATED);
        InvoiceDetailDto invoiceDetailDto = new InvoiceDetailDto();
        invoiceDetailDto.setLineNumber(1);
        invoiceDetailDto.setDetailNumber(1);
        invoiceDetailDto.setDetailType(InvoiceDetailType.SHIPPING_FEE);

        DiscountRecordDto recordDto1 = new DiscountRecordDto(PromoLevel.LINE_DISCOUNT, PromoType.ORDER_PURCHASE_AMOUNT,
                BigDecimal.ONE);
        recordDto1.setDiscount(new DiscountDto(DiscountType.ABSOLUTE, new BigDecimal(5)));
        DiscountRecordDto recordDto2 = new DiscountRecordDto(PromoLevel.LINE_DISCOUNT,
                PromoType.PRODUCT_ABSOLUTE_DISCOUNT,
                BigDecimal.ONE);
        recordDto2.setDiscount(new DiscountDto(DiscountType.PERCENTAGE, new BigDecimal(5)));
        DiscountRecordDto recordDto3 = new DiscountRecordDto(PromoLevel.DIVISION_DISCOUNT,
                PromoType.PRODUCT_ABSOLUTE_DISCOUNT,BigDecimal.ONE);
        recordDto3.setDiscount(new DiscountDto(DiscountType.PERCENTAGE, new BigDecimal(5)));
        invoiceDetailDto.setLineDiscountRecords(
                Arrays.asList(
                        recordDto1, recordDto2, recordDto3
                )
        );
        invoiceHeaderDto.setInvoiceDetails(Set.of(invoiceDetailDto));

        InvoiceHeaderDto copyInvoiceHeaderDao = SerializationUtils.clone(invoiceHeaderDto);

        final JsonMapper mapper = new JsonMapper();
        assertEquals("cloned structure must be equivalent with original", mapper.writeValueAsString(invoiceHeaderDto),
                mapper.writeValueAsString(copyInvoiceHeaderDao));
    }
}
