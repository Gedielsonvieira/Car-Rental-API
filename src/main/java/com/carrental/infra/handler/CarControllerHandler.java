package com.carrental.infra.handler;

import com.carrental.domain.exception.BusinessException;
import com.carrental.domain.exception.ErrorMessage;
import com.carrental.infra.controller.dto.ValidationError;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class CarControllerHandler {

    @ExceptionHandler(value = {BusinessException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage businessException(BusinessException ex) {
        return new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                ex.getMessage());
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ValidationError methodArgumentNotValid(MethodArgumentNotValidException ex) {
        ValidationError validationError = new ValidationError(
                HttpStatus.BAD_REQUEST.value(),
                new Date(),
                "invalid data"
        );

        for(FieldError fieldError : ex.getBindingResult().getFieldErrors()){
            validationError.addError(fieldError.getField(), fieldError.getDefaultMessage());
        }

        return validationError;
    }

}
