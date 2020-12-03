package com.hybris.caas.order.dto.order.returns;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.hybris.caas.dto.order.enums.CommonStatus;
import com.hybris.caas.dto.utils.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReturnReasonDto implements Serializable {

    private Long         id;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date         createdAt;

    private String       code;

    private Object       reason;

    private String       description;

    private String       createdBy;

    private boolean      returnToInventory;

    private CommonStatus status;

    private String       type;

    public ReturnReasonDto(Long id, String code, Object reason, CommonStatus status) {
        this.id = id;
        this.code = code;
        this.reason = reason;
        this.status = status;
    }
}
