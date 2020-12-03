package com.hybris.caas.dto.order.shipping;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.order.enums.DeliveryMethod;
import com.hybris.caas.dto.order.enums.ShipmentStatus;
import com.hybris.caas.dto.utils.Constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "shipmentNumber", "orderId" })
public class ShipmentDto {

    private String                     uuid;

    private String                     shipmentNumber;

    private ShipmentStatus             status;

    private String                     orderId;

    private List<DivisionDto>          divisions;

    private List<ShipmentOrderLineDto> orderLines;

    private LocationDto                fulfillmentLocation;

    private DeliveryDto                delivery;

    private DeliveryMethod             deliveryMethod;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                       createdAt;

    private Long                       totalNumber;

    public LocationDto getFulfillmentLocation() throws IllegalArgumentException {
        if (CollectionUtils.isEmpty(this.orderLines)) {
            return null;
        }
        final Set<LocationDto> locations = this.orderLines.stream()
            .map(ShipmentOrderLineDto::getFulfillmentLocation).filter(Objects::nonNull)
            .map(f -> new LocationDto(f.getFulfillmentLocationId(), f.getType()))
            .collect(Collectors.toSet());
        if (CollectionUtils.isNotEmpty(locations)) {
            if (locations.size() > 1) {
                //                throw new ServiceException("more than one fulfillment location exist in one shipment");
                throw new IllegalArgumentException(
                    "more than one fulfillment location exist in one shipment");
            } else {
                this.fulfillmentLocation = locations.iterator().next();
            }
        }
        return this.fulfillmentLocation;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class DivisionDto {
        private String id;
        private String name;
    }
}
