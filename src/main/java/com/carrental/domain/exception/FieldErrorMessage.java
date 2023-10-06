package com.carrental.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FieldErrorMessage {

    private String fieldName;
    private String messageError;

}
