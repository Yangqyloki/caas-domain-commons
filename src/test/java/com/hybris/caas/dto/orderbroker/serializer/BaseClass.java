package com.hybris.caas.dto.orderbroker.serializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@JsonDeserialize(using = CustomDeserializer.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public abstract class BaseClass {
    private String commonProp;
}
