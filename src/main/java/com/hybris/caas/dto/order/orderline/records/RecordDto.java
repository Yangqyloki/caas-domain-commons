package com.hybris.caas.dto.order.orderline.records;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hybris.caas.dto.order.enums.RecordStatus;
import com.hybris.caas.dto.order.enums.RecordType;

import com.hybris.caas.dto.utils.Constant;
import com.hybris.caas.dto.utils.serializer.CustomRecordDtoDeserializer;
import lombok.*;

@JsonDeserialize(using = CustomRecordDtoDeserializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class RecordDto implements Comparable<RecordDto>, Serializable {

    private RecordType   type;

    private RecordStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long         quantity;

    private String       reason;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date         createdAt;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date         modifiedAt;

    @Override
    public int compareTo(final RecordDto o) {
        final Comparator<RecordDto> byStatus = Comparator.comparing(RecordDto::getStatus);
        final Comparator<RecordDto> byModifiedAt = Comparator.comparing(RecordDto::getModifiedAt)
                .reversed();
        return byStatus.thenComparing(byModifiedAt).compare(this, o);
    }
}
