package com.hybris.caas.dto.order.shipping;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.order.orderline.fulfillment.FulfillmentLocationDto;

import com.hybris.caas.dto.utils.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentOrderLineDto {

    private String                 uuid;

    private Integer                lineNumber;

    private FulfillmentLocationDto fulfillmentLocation;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                   shippedAt;

}
