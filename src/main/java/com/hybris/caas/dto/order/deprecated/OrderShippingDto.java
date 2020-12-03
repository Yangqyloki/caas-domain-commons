package com.hybris.caas.dto.order.deprecated;

import com.hybris.caas.dto.order.address.AddressDto;
import com.hybris.caas.dto.order.shipping.ShippingMethodDto;

import lombok.Data;

@Data

public class OrderShippingDto {

    private ShippingMethodDto shippingMethod;

    private AddressDto        shippingAddress;
}
