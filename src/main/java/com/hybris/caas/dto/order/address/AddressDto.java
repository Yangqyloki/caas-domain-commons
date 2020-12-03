package com.hybris.caas.dto.order.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.stream.Stream;

import static com.hybris.caas.dto.utils.DomainUtils.joinNonEmptyStrings;

@Getter
@Setter
@ToString
public class AddressDto implements Serializable {

    @Size(max = 255)
    private String firstName;

    @Size(max = 255)
    private String lastName;

    @Size(max = 255)
    private String phoneNumber;

    @Size(max = 255)
    private String houseNumber;

    @Size(max = 255)
    private String building;

    @Size(max = 255)
    private String apartment;

    @NotBlank
    @Size(max = 255)
    private String addressLine1;

    @Size(max = 255)
    private String addressLine2;

    @Size(max = 255)
    private String county;

    @NotBlank
    @Size(max = 255)
    private String city;

    private String state;

    private String country;

    @NotBlank
    @Size(max = 255)
    private String zip;

    @Email
    @Size(max = 255, min = 1)
    private String emailAddress;

    @Override
    public String toString() {
        final Stream<String> addressParts = Stream.of(getFullName(), this.phoneNumber,
                getDetailAddress(), getGeneralAddress(), this.country);
        return joinNonEmptyStrings(addressParts, ", ");
    }

    @JsonIgnore
    public String getFullName() {
        return joinNonEmptyStrings(Stream.of(this.firstName, this.lastName), " ");
    }

    @JsonIgnore
    public String getDetailAddress() {
        final Stream<String> addressParts = Stream.of(
                joinNonEmptyStrings(Stream.of(this.houseNumber, this.building, this.apartment), " "),
                this.addressLine1, this.addressLine2, this.county);
        return joinNonEmptyStrings(addressParts, ", ");
    }

    @JsonIgnore
    public String getGeneralAddress() {

        final Stream<String> addressParts = Stream.of(this.city,
                joinNonEmptyStrings(Stream.of(this.state, this.zip), " "));
        return joinNonEmptyStrings(addressParts, ", ");
    }
}
