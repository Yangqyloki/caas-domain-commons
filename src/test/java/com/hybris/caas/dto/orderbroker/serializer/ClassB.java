package com.hybris.caas.dto.orderbroker.serializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@JsonDeserialize
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class ClassB extends BaseClass {
    String classBProp;
}