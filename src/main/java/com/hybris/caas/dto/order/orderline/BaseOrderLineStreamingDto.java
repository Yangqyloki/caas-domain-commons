package com.hybris.caas.dto.order.orderline;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties({ "originalQuantity", "createdAt", "shipFromAddress" })
public class BaseOrderLineStreamingDto extends BaseOrderLineMessageAndStreamingDto {
}