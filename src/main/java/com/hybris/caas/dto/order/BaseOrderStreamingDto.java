package com.hybris.caas.dto.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hybris.caas.dto.order.deprecated.OrderShippingDto;
import com.hybris.caas.dto.order.enums.SchemaType;
import com.hybris.caas.dto.order.nextsell.NextSellDto;
import com.hybris.caas.dto.order.orderline.BaseOrderLineStreamingDto;
import com.hybris.caas.dto.order.payment.OrderPaymentDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "orderId", "modifiedAt" })
@Component
@JsonIgnoreProperties({ "shippingMethod", "paymentCards", "shippingAddress", "modifiedBy",
                        "consent", "returnRecords", "paymentCards" })
public class BaseOrderStreamingDto extends BaseOrderDto implements Streamable {

    private List<BaseOrderLineStreamingDto> orderLines = new ArrayList<>();

    private NextSellDto                     nextSell;

    private OrderShippingDto                shipping;

    private OrderPaymentDto                 payment;

    private BigDecimal                      shFeeWithTax;

    private String                          displayStatus;

    private String                          applicationGroupId;

    @Override
    @JsonIgnore
    public String getSchemaType() {
        return SchemaType.STREAM_ORDER.getValue();
    }
}
