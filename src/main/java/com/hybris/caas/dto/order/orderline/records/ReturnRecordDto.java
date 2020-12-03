package com.hybris.caas.dto.order.orderline.records;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hybris.caas.dto.order.enums.CreditType;
import com.hybris.caas.dto.order.enums.RefundStatus;

import lombok.*;

@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class ReturnRecordDto extends RecordDto {

    private String       reasonCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String       fulfillmentLocationId;

    private boolean      returnToInventory;

    private BigDecimal   unitPrice;

    private BigDecimal   returnedTotal;

    private BigDecimal   returnedTax;

    private CreditType   creditType;

    private String       creditTypeDescription;

    private String       note;

    private String       itemCode;

    private String       productName;

    private RefundStatus refundStatus;

}
