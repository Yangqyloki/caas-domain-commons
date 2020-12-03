package com.hybris.caas.dto.invoice;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hybris.caas.dto.invoice.enums.InvoiceDetailType;
import com.hybris.caas.dto.order.discount.DiscountRecordDto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceDetailDto implements Serializable {
    @JsonIgnore
    private String                  uuid;

    private String                  orderId;

    @JsonInclude(NON_NULL)
    private Integer                 lineNumber;

    private int                     detailNumber;

    @JsonInclude(NON_NULL)
    private Long                    quantity;

    private BigDecimal              amount;

    private BigDecimal              taxPercent;

    private BigDecimal              detailTaxAmount;

    private String                  division;

    private InvoiceDetailType       detailType;

    private String                  returnReason;

    private Boolean                 taxFinalized;

    @JsonInclude(NON_NULL)
    private BigDecimal              unitPrice;

    @JsonInclude(NON_NULL)
    private BigDecimal              unitPriceWithTax;

    @JsonInclude(NON_NULL)
    private BigDecimal              lineTotalDiscount;

    @JsonInclude(NON_NULL)
    private BigDecimal              lineSubTotal;

    @JsonInclude(NON_NULL)
    public BigDecimal               lineSubTotalWithTax;

    @JsonInclude(NON_NULL)
    private BigDecimal              shFee;

    @JsonInclude(NON_NULL)
    private BigDecimal              shFeeWithTax;

    private String                  taxCode;

    /**
     * discount section for invoice details
     */
    private BigDecimal              lineDiscount;

    private BigDecimal              lineOrderDiscount;

    private BigDecimal              lineShFeeDiscount;

    private List<DiscountRecordDto> lineDiscountRecords;

    private int                     resendAttemptCount;
}
