package com.hybris.caas.dto.order.enums;

import com.hybris.caas.dto.order.orderline.standingorder.RecurrencePattern;

/**
 * Defines the supported types for a {@link RecurrencePattern}.
 */
public enum RecurrencePatternType {
    DAILY(1), WEEKLY(2), MONTHLY_DAY(3), MONTHLY_DATE(4), YEARLY_DAY(5), YEARLY_DATE(6);

    private int value;

    RecurrencePatternType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static String getBriefDescription(RecurrencePatternType recurrencePatternType) {
        String briefDescription = recurrencePatternType.name().toLowerCase();
        if (isDaily(recurrencePatternType.getValue())) {
            briefDescription = "day";
        }
        if (isWeekly(recurrencePatternType.getValue())) {
            briefDescription = "week";
        }
        if (isMonthly(recurrencePatternType.getValue())) {
            briefDescription = "month";
        }
        if (isYearly(recurrencePatternType.getValue())) {
            briefDescription = "year";
        }
        return briefDescription;
    }

    private static boolean isDaily(Integer value) {
        return 1 == value;
    }

    private static boolean isWeekly(Integer value) {
        return 2 == value;
    }

    private static boolean isMonthly(Integer value) {
        return value > 2 && value <= 4;
    }

    private static boolean isYearly(Integer value) {
        return value > 4 && value <= 6;
    }
}
