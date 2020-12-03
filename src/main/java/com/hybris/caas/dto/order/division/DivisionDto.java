package com.hybris.caas.dto.order.division;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

@Data
@NoArgsConstructor
public class DivisionDto {
    private String id;
    private String name;
    private String consumerLabel;
    private String imageUrl;

    public DivisionDto(String id, String name) {
        this.id = StringUtils.isEmpty(id) ? null : id;
        this.name = name;
    }
}
