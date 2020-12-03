package com.hybris.caas.dto.order.orderline;

import static java.util.Comparator.naturalOrder;
import static java.util.stream.Collectors.toList;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Sort;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hybris.caas.dto.order.attributeset.AttributeSetInfoDto;
import com.hybris.caas.dto.order.discount.DiscountRecordDto;
import com.hybris.caas.dto.order.enums.DeliveryMethod;
import com.hybris.caas.dto.order.enums.OrderLineStatus;
import com.hybris.caas.dto.order.orderline.continuity.StandingOrderResponse;
import com.hybris.caas.dto.order.orderline.fulfillment.ShipFromAddressDto;
import com.hybris.caas.dto.order.orderline.lineshipment.LineShipmentDto;
import com.hybris.caas.dto.order.orderline.product.CopyProductDto;
import com.hybris.caas.dto.order.orderline.records.RecordDto;
import com.hybris.caas.dto.utils.Constant;
import com.hybris.caas.dto.utils.DomainUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseOrderLineDto implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String                   uuid;

    private List<RecordDto>          records             = new ArrayList<>();

    private List<DiscountRecordDto>  lineDiscountRecords = new ArrayList<>();

    private LineShipmentDto          lineShipment;

    private String                   orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer                  lineNumber;

    private String                   productId;

    private String                   itemCode;

    private Long                     quantity;

    private Long                     originalQuantity;

    private BigDecimal               unitPrice;

    private BigDecimal               unitPriceWithTax;

    private BigDecimal               sellingPrice;

    private BigDecimal               sellingPriceWithTax;

    private BigDecimal               lineSubTotal;

    private BigDecimal               lineTotal;

    private BigDecimal               lineTax;

    private BigDecimal               lineTaxPercent;

    private BigDecimal               unitDiscount;

    private BigDecimal               lineDiscount;                           // continuity discount

    private BigDecimal               lineOrderDiscount;                      // distributed promotion discount

    private BigDecimal               lineTotalDiscount;                      // lineDiscount + lineOrderDiscount

    private BigDecimal               lineSellingSubTotal;

    private OrderLineStatus          lineStatus;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                     createdAt;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                     modifiedAt;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                     invoicedAt;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                     shippedAt;

    private String                   trackingNumber;

    private CopyProductDto           copyProduct;

    private ShipFromAddressDto       shipFromAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private StandingOrderResponse    standingOrder;

    private BigDecimal               lineSubTotalWithTax;

    private BigDecimal               lineSellingSubTotalWithTax;

    private String                   divisionId;

    private String                   sellingTreeId;

    private String                   applicationGroupId;

    private String                   experienceId;

    private ExternalReference        externalReference;

    private BigDecimal               lineShFeeTax;

    private BigDecimal               lineShFeeTaxPercent;

    private BigDecimal               lineShFee;

    private BigDecimal               lineShFeeWithTax;

    private BigDecimal               lineShFeeDiscount;

    private PurchasePath             purchasePath;

    private Set<AttributeSetInfoDto> attributeSets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<LineIdentifier>     lineIdentifiers;

    private DeliveryMethod           deliveryMethod;

    public int compareTo(BaseOrderLineDto o) {
        Comparator<BaseOrderLineDto> byDivision = Comparator
            .comparing(BaseOrderLineDto::getDivisionId, Comparator.nullsLast(naturalOrder()));
        Comparator<BaseOrderLineDto> byStatus = Comparator
            .comparing(BaseOrderLineDto::getLineStatus);
        Comparator<BaseOrderLineDto> byCreatedAt = Comparator
            .comparing(BaseOrderLineDto::getCreatedAt).reversed();
        Comparator<BaseOrderLineDto> byLineNumber = Comparator
            .comparing(BaseOrderLineDto::getLineNumber);
        Comparator<BaseOrderLineDto> comparator = byDivision.thenComparing(byStatus).thenComparing(byCreatedAt);
        if (this.getLineNumber() != null && o.getLineNumber() != null) {
            comparator = comparator.thenComparing(byLineNumber);
        }
        return comparator.compare(this, o);
    }

    public void sortRecords(List<Sort.Order> criteriaForRecords) {
        List<Comparator<RecordDto>> comparators = criteriaForRecords.stream()
            .map(DomainUtils::<RecordDto> comparator).collect(toList());
        Optional<Comparator<RecordDto>> finalComparator = comparators.stream()
            .reduce(Comparator::thenComparing);
        this.records.sort(finalComparator.orElse(naturalOrder()));
    }

    @Data
    public static class ExternalReference implements Serializable{

        private String referenceURL;

        private String refRequested;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LineIdentifier implements Serializable {

        private Integer lineNumber;

        private String uuid;
    }
}
