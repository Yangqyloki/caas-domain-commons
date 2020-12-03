package com.hybris.caas.dto.order.orderline.lineshipment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.order.orderline.fulfillment.FulfillmentLocationDto;
import com.hybris.caas.dto.order.shipping.DeliveryDto;
import com.hybris.caas.dto.order.enums.ShipmentStatus;

import com.hybris.caas.dto.utils.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineShipmentDto implements Serializable {
    private DeliveryDto            delivery;

    private FulfillmentLocationDto fulfillmentLocation;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                   shippedAt;

    private ShipmentMessageDto     shipment;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ShipmentMessageDto implements Serializable {
        private String         shipmentNumber;
        private ShipmentStatus status;
        private BigDecimal     actualShippingCost;
    }
}