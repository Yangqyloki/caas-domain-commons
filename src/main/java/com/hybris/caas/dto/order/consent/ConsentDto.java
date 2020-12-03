package com.hybris.caas.dto.order.consent;

import com.hybris.caas.dto.order.enums.ConsentTemplateType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @class ConsentDto.java
 * @createdAt 2018-07-12 2:43 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsentDto {
    private ConsentTemplateType consentTemplateType;
    private Boolean             accepted;
}
