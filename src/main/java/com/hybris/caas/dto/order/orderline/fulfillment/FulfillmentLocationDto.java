package com.hybris.caas.dto.order.orderline.fulfillment;

import java.io.Serializable;

import com.hybris.caas.dto.order.enums.FulfillmentLocationType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FulfillmentLocationDto implements Serializable {

    @NotBlank
    private String                  fulfillmentLocationId;

    private String                  zone;

    private String                  aisle;

    private String                  shelf;

    private String                  bin;

    private String                  location;

    @NotNull
    private FulfillmentLocationType type;
}
