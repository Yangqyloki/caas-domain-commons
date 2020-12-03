package com.hybris.caas.dto.order.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AuthorizationType {
    INITIAL,
    RECURRENT;

    @JsonCreator
    public static AuthorizationType forValue(final String value) {
        return AuthorizationType.valueOf(value.toUpperCase());
    }
}
