package com.hybris.caas.dto.order.enums;

import java.util.Objects;
import java.util.stream.Stream;

public enum DeliveryMethod {
                            BOPIS(0,
                                  "Buy Online, Pick-up in Store"), SFDC(200,
                                                                        "Ship from Distribution Center"), RH(400,
                                                                                                             "Reserve and Hold");

    private int    code;
    private String description;

    DeliveryMethod(final int code) {
        this.code = code;
    }

    DeliveryMethod(final int code, final String description) {
        this.code = code;
        this.description = description;
    }

    public static DeliveryMethod getByCode(final int code) {
        return Stream.of(values())
            .filter(deliveryMethod -> Objects.equals(deliveryMethod.getCode(), code)).findFirst()
            .orElse(null);
    }

    public int getCode() {
        return this.code;
    }
}
