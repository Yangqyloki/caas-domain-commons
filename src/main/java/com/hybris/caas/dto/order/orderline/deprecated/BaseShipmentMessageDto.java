package com.hybris.caas.dto.order.orderline.deprecated;

import java.math.BigDecimal;

import com.hybris.caas.dto.order.shipping.ShipmentDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Deprecated
public class BaseShipmentMessageDto extends ShipmentDto {

    private String     actualShippingCode;

    private String     actualShippingMethod;

    private BigDecimal actualShippingCost;

    private String     trackingNumber;
}