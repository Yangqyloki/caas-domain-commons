package com.hybris.caas.dto.order.enums;

import com.hybris.caas.dto.exception.FieldValidationException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by I341534 on 9/5/2017.
 */
@Slf4j
public enum CommonStatus {

    ACTIVE,INACTIVE,DELETED;

    static final String COMMA = ",";
    static final String INFO = " INFO: {}";
    static final String INVALID_STATUS = "Invalid status: [{}]." + INFO;

    public static List<CommonStatus> getCommonStatus(String status) throws FieldValidationException {
        if (StringUtils.isBlank(status)){
            return null;
        }
        List<CommonStatus> statusList = new ArrayList<>();
        String[] statusArray = status.split(COMMA);
        List<FieldError> fieldErrors = new ArrayList<>();
        Arrays.stream(statusArray).forEach(s->{
            if (StringUtils.isNotBlank(s)){
                try {
                    statusList.add(CommonStatus.valueOf(s.trim().toUpperCase()));
                }catch (IllegalArgumentException e){
                    log.error(INVALID_STATUS, s, ExceptionUtils.getStackTrace(e));
                    fieldErrors.add(new FieldError("reason","status",
                            String.format("status %s is invalid", s)));
                }
            }
        });
        if (fieldErrors.isEmpty()){
            return statusList;
        }
        throw new FieldValidationException(fieldErrors);
    }

}
