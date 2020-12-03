package com.hybris.caas.dto.order.enums;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public enum OrderLineStatus implements Serializable {
    /**
     * IMPORTANT: make sure the order is correct when you modify this!
     */
    DRAFT(0), WAITING(100), PENDING(200), CLEARING(400), REVIEW(600), BACKORDERED(700), MISPICKED(725), READY(750),
    WAREHOUSE(800), PICKED(900), PACKED(950), READY_FOR_PICKUP(975), SHIPPED(1000), PICKEDUP(1100), INVOICED(1200),
    RETURNED(1300), CANCELLED(1400), TIMEOUT(1425), EXPIRED(1437), SKIPPED(1450), VOID_CANCELLED(1600), AUTO_CANCELLED(1700);

    private final int code;

    OrderLineStatus(final int code) {
        this.code = code;
    }

    public static List<OrderLineStatus> allExternalStatus() {
        return Arrays.asList(WAITING, PENDING, CLEARING, REVIEW, BACKORDERED, MISPICKED, READY,
                WAREHOUSE, PICKED, PACKED, SHIPPED, INVOICED, RETURNED, CANCELLED, SKIPPED,
                VOID_CANCELLED, AUTO_CANCELLED, READY_FOR_PICKUP, PICKEDUP, TIMEOUT, EXPIRED);
    }

    public static OrderLineStatus getByCode(final int code) {
        return Stream.of(values()).filter(status -> Objects.equals(status.getCode(), code))
                .findAny().orElse(null);
    }

    public boolean isRoutable() {
        return this == CLEARING || this == BACKORDERED || this == MISPICKED;
    }

    public int getCode() {
        return this.code;
    }
}