package com.hybris.caas.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hybris.caas.dto.order.nextsell.NextSellDto;
import com.hybris.caas.dto.order.orderline.BaseOrderLineEmailDto;
import com.hybris.caas.dto.order.payment.PaymentDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(of = {"orderId", "modifiedAt"})
@JsonIgnoreProperties({"divisions", "originalShFee", "originalShFeeWithTax", "returnRecords", "shippingMethod", "totalStr"})
public class BaseOrderEmailDto extends BaseOrderDto implements Serializable {

    @JsonIgnoreProperties({"authorizedAmount", "creditCardStatus", "csSubscriptionId",
            "paymentAmount", "paymentAttemptCount", "paymentStatus",
            "paymentUpdatedAt", "refundAmount", "refundAttemptCount",
            "refundCreditCardStatus", "refundStatus", "refundUpdatedAt", "token"})
    protected PaymentDto payment;

    private NextSellDto nextSell;

    private String displayStatus;

    private List<BaseOrderLineEmailDto> orderLines = new ArrayList<>();

}
