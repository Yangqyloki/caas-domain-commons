package com.hybris.caas.dto.order.enums;

import java.util.Objects;
import java.util.stream.Stream;

public enum ShipmentStatus {

                            DRAFT(0), PENDING(200), MISPICKED(725), READY(750), WAREHOUSE(800), PICKED(900), PACKED(950), READY_FOR_PICKUP(975), SHIPPED(1000), PICKEDUP(1100), TIMEOUT(1425), EXPIRED(1437);

    private final int code;

    ShipmentStatus(final int code) {
        this.code = code;
    }

    public static ShipmentStatus getByCode(final int code) {
        return Stream.of(values()).filter(status -> Objects.equals(status.getCode(), code))
            .findAny().orElse(null);
    }

    public int getCode() {
        return this.code;
    }
}