package com.hybris.caas.dto.order.shipping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.utils.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDto implements Serializable {

    private String     trackingNumber;

    private String     actualShippingCode;

    private String     actualShippingMethod;

    private BigDecimal actualShippingCost = BigDecimal.ZERO;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date shippedAt;
}
