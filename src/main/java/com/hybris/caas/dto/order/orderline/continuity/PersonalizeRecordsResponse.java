package com.hybris.caas.dto.order.orderline.continuity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hybris.caas.dto.utils.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalizeRecordsResponse {

    private String frequency;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date createdAt;

    private String createdBy;
}
