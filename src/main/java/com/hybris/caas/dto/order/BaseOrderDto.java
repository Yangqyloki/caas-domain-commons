package com.hybris.caas.dto.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hybris.caas.dto.order.address.AddressDto;
import com.hybris.caas.dto.order.attributeset.AttributeSetInfoDto;
import com.hybris.caas.dto.order.consent.ConsentDto;
import com.hybris.caas.dto.order.customer.CopyCustomerDto;
import com.hybris.caas.dto.order.discount.DiscountRecordDto;
import com.hybris.caas.dto.order.division.DivisionDto;
import com.hybris.caas.dto.order.enums.Channel;
import com.hybris.caas.dto.order.enums.Currency;
import com.hybris.caas.dto.order.enums.OrderLineStatus;
import com.hybris.caas.dto.order.orderline.BaseOrderLineDto;
import com.hybris.caas.dto.order.orderline.records.ReturnRecordDto;
import com.hybris.caas.dto.order.payment.PaymentCardDto;
import com.hybris.caas.dto.order.payment.PaymentDto;
import com.hybris.caas.dto.order.shipping.ShippingMethodDto;
import com.hybris.caas.dto.utils.Constant;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "orderId", "modifiedAt" })
public abstract class BaseOrderDto {
    private final List<PaymentCardDto> paymentCards    = new ArrayList<>();
    private List<DiscountRecordDto>    discountRecords = new ArrayList<>();
    protected PaymentDto               payment;
    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                       createdAt;
    private ShippingMethodDto          shippingMethod;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                       modifiedAt;

    private String                     orderId;

    private String                     customerNumber;

    private String                     customerSessionId;

    private String                     customerEmail;

    private BigDecimal                 subTotal;

    private BigDecimal                 discount;                           // aggregation of all lineDiscount

    private BigDecimal                 orderDiscount;                      // promotion discount

    private BigDecimal                 totalDiscount;                      // discount + orderDiscount

    private BigDecimal                 sellingSubTotal;

    private BigDecimal                 tax;

    private Currency                   currency;

    private Channel                    channel;

    private OrderLineStatus            status;

    private AddressDto                 shippingAddress;

    private AddressDto                 billingAddress;

    private BigDecimal                 total;

    private BigDecimal                 returnedTotal;

    private CopyCustomerDto            copyCustomer;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                       placedAt;

    private BigDecimal                 shFee;

    private String                     reviewReason;

    private String                     modifiedBy;

    private String                     experienceId;

    private String                     divisionId;

    private String                     applicationGroupId;

    private List<ConsentDto>           consent;

    private List<ReturnRecordDto>      returnRecords;

    private boolean                    taxIncluded;

    private BigDecimal                 subTotalWithTax;

    private BigDecimal                 sellingSubTotalWithTax;

    private BigDecimal                 shFeeTax;

    private BigDecimal                 shFeeTaxPercent;

    private boolean                    shFeeTaxFinalized;

    private BigDecimal                 shFeeWithTax;

    private BigDecimal                 originalShFeeWithTax;

    private BigDecimal                 originalShFee;

    private BigDecimal                 shFeeDiscount;

    private String                     languageAtCreation;

    private String                     totalStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<DivisionDto>          divisions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<ShippingMethodDto>     shippingMethods;

    public abstract List<? extends BaseOrderLineDto> getOrderLines();

    private Set<AttributeSetInfoDto>    attributeSets;

    /********************************************
     * ************* Modifications **************
     ********************************************/

    public void addPaymentCard(final PaymentCardDto paymentCard) {
        this.paymentCards.add(paymentCard);
    }
}