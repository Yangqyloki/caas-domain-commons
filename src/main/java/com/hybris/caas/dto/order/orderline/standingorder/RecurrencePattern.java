package com.hybris.caas.dto.order.orderline.standingorder;

import java.time.DayOfWeek;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

import com.hybris.caas.dto.order.enums.DayOfWeekExtended;
import com.hybris.caas.dto.order.enums.InstanceIndex;
import com.hybris.caas.dto.order.enums.RecurrencePatternType;
import com.hybris.caas.dto.order.orderline.standingorder.soc.SocDto;

import lombok.Data;

/**
 * Canonical format of recurrence pattern to use when converting it to iCalendar format.
 */
@Data
public class RecurrencePattern {
    private String                id;
    private RecurrencePatternType type;
    private String                name;
    private String                description;
    private String                consumerLabel;
    private Boolean               active;
    private Integer               interval;
    private Integer               occurrences;
    private InstanceIndex         instance;
    private DayOfWeekExtended     dayOfWeek;
    private Set<DayOfWeek>        daysOfWeek;
    private Short                 dayOfMonth;
    private Short                 monthOfYear;

    public RecurrencePattern() {
        // no args constructor
    }

    public RecurrencePattern(final String id, final RecurrencePatternType type, final String name,
                             final String description, final String consumerLabel,
                             final Boolean active, final Integer interval,
                             final Integer occurrences, final InstanceIndex instance,
                             final DayOfWeekExtended dayOfWeek, final Set<DayOfWeek> daysOfWeek,
                             final Short dayOfMonth, final Short monthOfYear) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.consumerLabel = consumerLabel;
        this.active = active;
        this.interval = interval;
        this.occurrences = occurrences;
        this.instance = instance;
        this.dayOfWeek = dayOfWeek;
        this.daysOfWeek = daysOfWeek;
        this.dayOfMonth = dayOfMonth;
        this.monthOfYear = monthOfYear;
    }

    public RecurrencePattern(final SocDto.StandingOrderRecurrencePattern socRecurrencePattern) {
        this.id = socRecurrencePattern.getId();
        this.type = RecurrencePatternType.valueOf(socRecurrencePattern.getType());
        this.name = socRecurrencePattern.getName();
        this.description = socRecurrencePattern.getDescription();
        this.consumerLabel = socRecurrencePattern.getConsumerLabel();
        this.interval = socRecurrencePattern.getInterval();
        this.occurrences = socRecurrencePattern.getOccurrences();
        this.instance = socRecurrencePattern.getInstance();
        this.daysOfWeek = socRecurrencePattern.getDaysOfWeek();
        this.dayOfWeek = socRecurrencePattern.getDayOfWeek();
        this.dayOfMonth = socRecurrencePattern.getDayOfMonth();
        this.monthOfYear = socRecurrencePattern.getMonthOfYear();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final RecurrencePattern that = (RecurrencePattern) o;
        return Objects.equals(id, that.id) && type == that.type && Objects.equals(name, that.name)
                && Objects.equals(description, that.description)
                && Objects.equals(consumerLabel, that.consumerLabel)
                && Objects.equals(active, that.active) && Objects.equals(interval, that.interval)
                && Objects.equals(occurrences, that.occurrences) && instance == that.instance
                && dayOfWeek == that.dayOfWeek && Objects.equals(daysOfWeek, that.daysOfWeek)
                && Objects.equals(dayOfMonth, that.dayOfMonth)
                && Objects.equals(monthOfYear, that.monthOfYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, description, consumerLabel, active, interval,
                occurrences, instance, dayOfWeek, daysOfWeek, dayOfMonth, monthOfYear);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RecurrencePattern.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'").add("type=" + type).add("name='" + name + "'")
                .add("description='" + description + "'").add("consumerLabel='" + consumerLabel + "'")
                .add("active=" + active).add("interval=" + interval).add("occurrences=" + occurrences)
                .add("instance=" + instance).add("dayOfWeek=" + dayOfWeek)
                .add("daysOfWeek=" + daysOfWeek).add("dayOfMonth=" + dayOfMonth)
                .add("monthOfYear=" + monthOfYear).toString();
    }

    public static RecurrencePatternBuilder builder() {
        return new RecurrencePatternBuilder();
    }
}
