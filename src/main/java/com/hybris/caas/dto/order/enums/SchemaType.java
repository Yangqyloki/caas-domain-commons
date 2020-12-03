package com.hybris.caas.dto.order.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SchemaType {
    STREAM_ORDER("stream-order"),
    STREAM_INVOICE("stream-invoice");

    private final String value;

    public String getValue() {
        return value;
    }

    public static SchemaType getSchemaTypeByValue(String type) {
        for (SchemaType temp : SchemaType.values()) {
            if (temp.value.equalsIgnoreCase(type)) {
                return temp;
            }
        }
        throw new IllegalArgumentException("Object type can't be find by: " + type);
    }
}
