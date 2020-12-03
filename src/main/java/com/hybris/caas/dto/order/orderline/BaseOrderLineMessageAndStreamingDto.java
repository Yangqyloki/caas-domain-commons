package com.hybris.caas.dto.order.orderline;

import com.hybris.caas.dto.order.orderline.deprecated.BaseShipmentMessageDto;
import com.hybris.caas.dto.order.orderline.standingorder.StandingOrderMessageDto;
import com.hybris.caas.dto.order.orderline.fulfillment.FulfillmentLocationDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseOrderLineMessageAndStreamingDto extends BaseOrderLineDto {

    private String                  deviceId;

    private String                  storeId;

    private StandingOrderMessageDto standingOrder;

    /***product detail page link**/
    private String                  pdpLink;

    private String                  displayLineStatus;
}
