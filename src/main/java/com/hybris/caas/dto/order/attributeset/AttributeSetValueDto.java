package com.hybris.caas.dto.order.attributeset;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttributeSetValueDto implements Serializable {
    private String  code;
    private String  value;
    private String  name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean visibleToConsumer;

    private String  consumerLabel;
    private String  valueConsumerLabel;

    public AttributeSetValueDto(String code, String value, String name) {
        this.code = code;
        this.value = value;
        this.name = name;
    }
}
