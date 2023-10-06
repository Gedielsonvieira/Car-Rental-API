package com.carrental.infra.controller.dto;

import com.carrental.domain.exception.ErrorMessage;
import com.carrental.domain.exception.FieldErrorMessage;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class ValidationError extends ErrorMessage {

    private List<FieldErrorMessage> errors = new ArrayList<>();

    public ValidationError(int statusCode, Date timestamp, String message) {
        super(statusCode, timestamp, message);
    }

    public void addError(String fieldName, String messageError){
        errors.add(new FieldErrorMessage(fieldName, messageError));
    }
}
