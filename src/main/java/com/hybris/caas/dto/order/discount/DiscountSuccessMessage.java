package com.hybris.caas.dto.order.discount;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class DiscountSuccessMessage implements Serializable {

    private String message;
    private String contentId;
}
