package com.hybris.caas.dto.order.discount;

import com.hybris.caas.dto.order.enums.promotion.DiscountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscountDto implements Serializable {

    private DiscountType type;

    private BigDecimal value;
}
