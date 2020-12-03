package com.hybris.caas.dto.order.orderline.standingorder.soc;

import com.hybris.caas.dto.order.enums.soc.DiscountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDto implements Serializable {
    private DiscountType type;
    private BigDecimal   value;
}
