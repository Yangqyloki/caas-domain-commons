package com.hybris.caas.dto.order.orderline.continuity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hybris.caas.dto.order.enums.DayOfWeekExtended;
import com.hybris.caas.dto.order.enums.InstanceIndex;
import com.hybris.caas.dto.order.enums.RecurrencePatternType;
import com.hybris.caas.dto.utils.DomainUtils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RecurrencePatternResponse implements Serializable {
    private String                           id;

    private RecurrencePatternType            type;

    private String                           name;

    private String                           consumerLabel;

    private Integer                          interval;

    private String                           frequency;

    private Integer                          occurrences;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private InstanceIndex                    instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private DayOfWeekExtended                dayOfWeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<DayOfWeek>                   daysOfWeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Short                            dayOfMonth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Short                            monthOfYear;

    private List<PersonalizeRecordsResponse> personalizeRecords = new ArrayList<>();

    public String getFrequency() {
        return DomainUtils.generateFrequency(this.interval, this.type.name());
    }
}
