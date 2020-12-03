package com.hybris.caas.dto.order.payment;

import com.hybris.caas.dto.order.enums.PaymentCardType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentCardDto {

    private PaymentCardType cardType;

    private String creditCardExpiredAt;

    private String creditCardType;

    private String creditCardLastFourDigits;
}
