package com.hybris.caas.dto.order.orderline.standingorder;

import java.time.DayOfWeek;
import java.util.Set;

import com.hybris.caas.dto.order.enums.DayOfWeekExtended;
import com.hybris.caas.dto.order.enums.InstanceIndex;
import com.hybris.caas.dto.order.enums.RecurrencePatternType;

/**
 * Builder for {@link RecurrencePattern} objects for fluid construction interface.
 */
public class RecurrencePatternBuilder {
    private String                idValue;
    private RecurrencePatternType typeValue;
    private String                nameValue;
    private String                descriptionValue;
    private String                consumerLabelValue;
    private Boolean               activeValue;
    private Integer               intervalValue;
    private Integer               occurrencesValue;
    private InstanceIndex         instanceValue;
    private DayOfWeekExtended     dayOfWeekValue;
    private Set<DayOfWeek>        daysOfWeekValue;
    private Short                 dayOfMonthValue;
    private Short                 monthOfYearValue;

    public RecurrencePatternBuilder() {
        // no args constructor
    }

    public RecurrencePatternBuilder id(String id) {
        this.idValue = id;
        return this;
    }

    public RecurrencePatternBuilder type(RecurrencePatternType type) {
        this.typeValue = type;
        return this;
    }

    public RecurrencePatternBuilder name(String name) {
        this.nameValue = name;
        return this;
    }

    public RecurrencePatternBuilder description(String description) {
        this.descriptionValue = description;
        return this;
    }

    public RecurrencePatternBuilder consumerLabel(String consumerLabel) {
        this.consumerLabelValue = consumerLabel;
        return this;
    }

    public RecurrencePatternBuilder active(Boolean active) {
        this.activeValue = active;
        return this;
    }

    public RecurrencePatternBuilder interval(Integer interval) {
        this.intervalValue = interval;
        return this;
    }

    public RecurrencePatternBuilder occurrences(Integer occurrences) {
        this.occurrencesValue = occurrences;
        return this;
    }

    public RecurrencePatternBuilder instance(InstanceIndex instance) {
        this.instanceValue = instance;
        return this;
    }

    public RecurrencePatternBuilder dayOfWeek(DayOfWeekExtended dayOfWeek) {
        this.dayOfWeekValue = dayOfWeek;
        return this;
    }

    public RecurrencePatternBuilder daysOfWeek(Set<DayOfWeek> daysOfWeek) {
        this.daysOfWeekValue = daysOfWeek;
        return this;
    }

    public RecurrencePatternBuilder dayOfMonth(Short dayOfMonth) {
        this.dayOfMonthValue = dayOfMonth;
        return this;
    }

    public RecurrencePatternBuilder monthOfYear(Short monthOfYear) {
        this.monthOfYearValue = monthOfYear;
        return this;
    }

    public RecurrencePattern build() {
        return new RecurrencePattern(idValue, typeValue, nameValue, descriptionValue,
                consumerLabelValue, activeValue, intervalValue, occurrencesValue, instanceValue,
                dayOfWeekValue, daysOfWeekValue, dayOfMonthValue, monthOfYearValue);
    }

    public String toString() {
        return "RecurrencePattern.RecurrencePatternBuilder(id=" + this.idValue + ", type="
                + this.typeValue + ", name=" + this.nameValue + ", description="
                + this.descriptionValue + ", consumerLabel=" + this.consumerLabelValue + ", active="
                + this.activeValue + ", interval=" + this.intervalValue + ", occurrences="
                + this.occurrencesValue + ", instance=" + this.instanceValue + ", dayOfWeek="
                + this.dayOfWeekValue + ", daysOfWeek=" + this.daysOfWeekValue + ", dayOfMonth="
                + this.dayOfMonthValue + ", monthOfYear=" + this.monthOfYearValue + ")";
    }
}
