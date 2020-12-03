package com.hybris.caas.dto.order.payment;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderPaymentDto extends PaymentDto {
    private List<PaymentCardDto> paymentCards = new ArrayList<>();
}
