package com.hybris.caas.dto.order.payment;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.order.enums.CreditCardStatus;
import com.hybris.caas.dto.order.enums.PaymentMethod;

import com.hybris.caas.dto.utils.Constant;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentDto {

    private String           token;

    private BigDecimal       paymentAmount;

    private BigDecimal       refundAmount;

    private BigDecimal       authorizedAmount;

    private String           paymentStatus;

    private int              paymentAttemptCount;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date             paymentUpdatedAt;

    private String           creditCardStatus;

    private PaymentMethod    paymentMethod;

    private int              refundAttemptCount;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date             refundUpdatedAt;

    private CreditCardStatus refundCreditCardStatus;

    private String           refundStatus;

    private String           csSubscriptionId;

    public boolean notAuthorizationApproved() {
        return org.apache.commons.lang3.StringUtils.equals(this.creditCardStatus,
                CreditCardStatus.AUTHORIZATION_APPROVED.name());
    }
}
