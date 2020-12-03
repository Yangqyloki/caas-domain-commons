package com.hybris.caas.dto.order.discount;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hybris.caas.dto.order.enums.PromoLevel;
import com.hybris.caas.dto.order.enums.PromoType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class DiscountRecordDto implements Serializable {
    private PromoLevel             promoLevel;

    private PromoType              promoType;

    private BigDecimal             amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DiscountDto            discount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String                 consumerLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String                 couponCode;

    private String                 promoReferenceId;

    private boolean                applied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DiscountSuccessMessage successMessage;

    public DiscountRecordDto(final PromoLevel promoLevel, final PromoType promoType,
                             final BigDecimal amount) {
        this.promoLevel = promoLevel;
        this.promoType = promoType;
        this.amount = amount;
    }

    public boolean promoTypeEquals(PromoType promoType) {
        return promoType == this.getPromoType();
    }

    public boolean promoLevelEquals(PromoLevel promoLevel) {
        return promoLevel == this.getPromoLevel();
    }
}
