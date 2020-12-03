package com.hybris.caas.order.dto.order.cancel;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hybris.caas.dto.order.orderline.records.RecordDto;
import com.hybris.caas.order.model.enums.CancelBehavior;

import lombok.*;

@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class CancellationRecordDto extends RecordDto implements Serializable {

    private String         code;

    private String         comments;

    private long           beforeQuantity;

    private long           afterQuantity;

    private boolean        emailSent = false;

    private CancelBehavior cancelBehavior;

    private String         cancelledBy;
}
