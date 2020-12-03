package com.hybris.caas.dto.order.shipping;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingMethodDto {

    private String     id;

    private String     name;

    private String     taxCode;

    private boolean    defaultFlag;

    private BigDecimal cost;

    private BigDecimal originalCost;

    private BigDecimal discount;

    private String     divisionId;

    @JsonIgnore
    private String     type;

    public ShippingMethodDto(String id, String name, String taxCode, boolean defaultFlag,
                             BigDecimal cost, String divisionId, String type) {
        this.id = id;
        this.name = name;
        this.taxCode = taxCode;
        this.defaultFlag = defaultFlag;
        this.cost = cost;
        this.divisionId = divisionId;
        this.type = type;
    }

    public ShippingMethodDto(String id, String name, String taxCode, boolean defaultFlag,
                             BigDecimal cost) {
        this.id = id;
        this.name = name;
        this.taxCode = taxCode;
        this.defaultFlag = defaultFlag;
        this.cost = cost;
    }

    public ShippingMethodDto(String id, String name, String taxCode, boolean defaultFlag,
                             BigDecimal cost, String divisionId) {
        this.id = id;
        this.name = name;
        this.taxCode = taxCode;
        this.defaultFlag = defaultFlag;
        this.cost = cost;
        this.divisionId = divisionId;
    }

}
