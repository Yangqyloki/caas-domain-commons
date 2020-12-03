package com.hybris.caas.dto.order.customer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CopyCustomerDto {

    private String customerNumber;

    private String firstName;

    private String middleName;

    private String lastName;

    private String nickName;

    private String customAttributes;

    private String checkSum;
}
