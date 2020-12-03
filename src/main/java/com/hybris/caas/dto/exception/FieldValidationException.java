package com.hybris.caas.dto.exception;

import com.google.common.collect.ImmutableList;
import org.springframework.validation.FieldError;

import java.util.Collections;
import java.util.List;

/**
 * Just migrate ValidationException exception in Domain library.
 */
public class FieldValidationException extends Exception {
    private static final String DEFAULT_GLOBAL_MSG = "Error validating your data.";
    private final List<FieldError> fieldErrors;

    public FieldValidationException(final List<FieldError> fieldErrors) {
        super(DEFAULT_GLOBAL_MSG);
        this.fieldErrors = ImmutableList.copyOf(fieldErrors);
    }

    public FieldValidationException(final List<FieldError> fieldErrors, final String globalMessage) {
        super(globalMessage);
        this.fieldErrors = ImmutableList.copyOf(fieldErrors);
    }

    public FieldValidationException(final FieldError fieldError) {
        super(DEFAULT_GLOBAL_MSG);
        this.fieldErrors = ImmutableList.copyOf(Collections.singletonList(fieldError));
    }

    public FieldValidationException(final FieldError fieldError, final String globalMessage) {
        super(globalMessage);
        this.fieldErrors = ImmutableList.copyOf(Collections.singletonList(fieldError));
    }

    public FieldValidationException(final String globalMessage) {
        super(globalMessage);
        this.fieldErrors = Collections.emptyList();
    }

    public List<FieldError> getFieldErrors() {
        return this.fieldErrors;
    }

}