package com.hybris.caas.dto.order.orderline.product;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CopyProductDto implements Serializable {

    private String     productId;

    private String     parentId;

    private String     name;

    private String     customAttributes;

    private String     variantAttributes;

    private String     media;

    private String     checkSum;

    private String     type;

    private String     description;

    private String     taxCode;

    private BigDecimal price;

    private String     standingOrderConfigurationIds;

    private String     collectionIds;

    private String     categoryIds;

    private BigDecimal shippingUnitValue;

}
