package com.hybris.caas.dto.invoice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import com.hybris.caas.dto.order.Streamable;
import com.hybris.caas.dto.order.address.AddressDto;
import com.hybris.caas.dto.order.enums.Currency;
import com.hybris.caas.dto.invoice.enums.InvoiceStatus;
import com.hybris.caas.dto.invoice.enums.InvoiceType;
import com.hybris.caas.dto.order.enums.SchemaType;
import com.hybris.caas.dto.utils.Constant;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceHeaderDto implements Streamable, Serializable {

    private Set<InvoiceDetailDto> invoiceDetails = new LinkedHashSet<>();

    private String                invoiceId;

    private InvoiceType           invoiceType;

    private InvoiceStatus         invoiceStatus;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date                  invoicedAt;

    private String                customerNumber;

    private String                orderId;

    private BigDecimal            invoiceAmount;

    private BigDecimal            invoiceTaxAmount;

    private AddressDto shippingAddress;

    private AddressDto            billingAddress;

    private String                division;

    private BigDecimal            invoiceShFee;

    private Currency currency;

    private boolean               taxIncluded;

    @Override
    @JsonIgnore
    public String getSchemaType() {
        return SchemaType.STREAM_INVOICE.getValue();
    }
}

