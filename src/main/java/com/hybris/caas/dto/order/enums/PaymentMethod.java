package com.hybris.caas.dto.order.enums;

import com.google.common.collect.ImmutableMap;

public enum PaymentMethod {
    CREDIT_CARD,
    APPLE_PAY,
    GOOGLE_PAY;

    @Override
    public String toString() {
        return ImmutableMap.of(CREDIT_CARD, "Credit Card", APPLE_PAY, "Apple Pay", GOOGLE_PAY, "Google Pay").get(this);
    }
}

