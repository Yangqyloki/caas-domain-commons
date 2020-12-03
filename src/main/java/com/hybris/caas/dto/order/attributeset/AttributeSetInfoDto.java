package com.hybris.caas.dto.order.attributeset;

import java.io.Serializable;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttributeSetInfoDto implements Serializable {
    private AttributeSetDto           attributeSet;
    private Set<AttributeSetValueDto> values;
}
