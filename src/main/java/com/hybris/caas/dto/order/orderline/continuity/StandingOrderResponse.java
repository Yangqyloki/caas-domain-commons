package com.hybris.caas.dto.order.orderline.continuity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.order.orderline.standingorder.soc.DiscountDto;

import com.hybris.caas.dto.utils.Constant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
public class StandingOrderResponse implements Serializable {
    protected String                    socId;

    protected Integer                   leg;

    protected String                    firstOrderId;

    protected String                    parentOrderId;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    protected Date                      waitingDate;

    protected RecurrencePatternResponse recurrencePattern;

    protected DiscountDto               discount;

}