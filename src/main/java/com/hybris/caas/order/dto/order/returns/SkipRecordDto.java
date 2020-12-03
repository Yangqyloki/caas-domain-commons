package com.hybris.caas.order.dto.order.returns;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hybris.caas.dto.order.orderline.records.RecordDto;
import lombok.*;

@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class SkipRecordDto extends RecordDto {

    private String     code;

}
