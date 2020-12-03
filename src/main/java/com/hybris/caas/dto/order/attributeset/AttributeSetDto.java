package com.hybris.caas.dto.order.attributeset;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@AllArgsConstructor
public class AttributeSetDto implements Serializable {
    private String id;
    private String code;
    private String name;
    private String titleLabel;

    public AttributeSetDto(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
}
