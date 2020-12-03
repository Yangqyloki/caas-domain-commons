package com.hybris.caas.dto.order.nextsell;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NextSellDto {
    private boolean accepted;
    private String  optOutUrl;
}
