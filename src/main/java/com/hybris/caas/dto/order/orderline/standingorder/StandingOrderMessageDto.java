package com.hybris.caas.dto.order.orderline.standingorder;

import java.math.BigDecimal;

import com.hybris.caas.dto.order.enums.soc.DiscountType;
import com.hybris.caas.dto.order.orderline.continuity.StandingOrderResponse;
import com.hybris.caas.dto.order.orderline.standingorder.soc.DiscountDto;

import lombok.Data;

@Data
public class StandingOrderMessageDto extends StandingOrderResponse {

    private DiscountType discountType;
    private BigDecimal   discountValue;

    public StandingOrderMessageDto() {
        super();
    }

    public DiscountDto getDiscount() {
        if (this.discountType != null || this.discountValue != null) {
            return new DiscountDto(discountType, discountValue);
        }
        return null;
    }
}
