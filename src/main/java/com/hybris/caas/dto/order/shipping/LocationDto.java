package com.hybris.caas.dto.order.shipping;

import com.hybris.caas.dto.order.enums.FulfillmentLocationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(of = "fulfillmentLocationId")
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
    @NotBlank
    private String                  fulfillmentLocationId;

    @NotNull
    private FulfillmentLocationType type;
}
