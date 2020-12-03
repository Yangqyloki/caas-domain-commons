package com.hybris.caas.dto.order.orderline.standingorder.soc;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;

import com.hybris.caas.dto.order.enums.DayOfWeekExtended;
import com.hybris.caas.dto.order.enums.soc.DiscountType;
import com.hybris.caas.dto.order.enums.InstanceIndex;

import lombok.Data;

@Data
public class SocDto {
    private String                               id;
    private String                               name;
    private String                               description;
    private Boolean                              available;
    private DiscountDto                          discount;
    private List<StandingOrderRecurrencePattern> recurrencePatterns;

    @Data
    public static class StandingOrderRecurrencePattern {
        private String            id;
        private String            consumerLabel;
        private String            name;
        private String            type;
        private String            description;
        private Integer           interval;
        private Integer           occurrences;
        private InstanceIndex     instance;
        private DayOfWeekExtended dayOfWeek;
        private Set<DayOfWeek>    daysOfWeek;
        private Short             dayOfMonth;
        private Short             monthOfYear;
        private DiscountDto       discount;
    }

    /**
     * check the validity of discount
     * 1. If discount value less than zero, should throw exception
     * 2. If the discount type is PERCENTAGE but discount value more than 100, should set discount value to 100
     */
    public void checkDiscount() throws IllegalArgumentException {
        if (discount != null) {
            BigDecimal discountValue = discount.getValue();
            if (discountValue.compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException();
            }
            BigDecimal MAX_PERCENTAGE = new BigDecimal(100);
            if (discount.getType() == DiscountType.PERCENTAGE && discountValue.compareTo(MAX_PERCENTAGE) > 0) {
                discount.setValue(MAX_PERCENTAGE);
            }
        }
    }
}
