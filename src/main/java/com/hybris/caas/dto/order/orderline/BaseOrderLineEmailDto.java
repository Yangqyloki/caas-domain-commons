package com.hybris.caas.dto.order.orderline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hybris.caas.dto.order.orderline.standingorder.StandingOrderMessageDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties({ "records", "purchasePath"})
public class BaseOrderLineEmailDto extends BaseOrderLineDto {

    private String                  deviceId;

    private String                  storeId;

    private StandingOrderMessageDto standingOrder;

    private String                  pdpLink;

    private String                  displayLineStatus;
}