package com.hybris.caas.dto.order.orderline.fulfillment;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShipFromAddressDto implements Serializable {

    private String city;

    private String country;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String addressLine4;

    private String state;

    private String street;

    private String streetNumber;

    private String zip;

}
