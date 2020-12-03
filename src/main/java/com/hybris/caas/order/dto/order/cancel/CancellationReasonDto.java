package com.hybris.caas.order.dto.order.cancel;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import com.hybris.caas.dto.order.enums.CommonStatus;
import com.hybris.caas.dto.utils.Constant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CancellationReasonDto implements Serializable {

    private String       code;

    private String       type;

    private Object       reason;

    @JsonFormat(pattern = Constant.DATE_FORMAT)
    private Date         createdAt;

    private String       createdBy;

    private CommonStatus status;

    public CancellationReasonDto(String type, Object reason, CommonStatus status) {
        this.type = type;
        this.reason = reason;
        this.status = status;
    }

    public CancellationReasonDto(String type, Object reason) {
        this.type = type;
        this.reason = reason;
    }

}
