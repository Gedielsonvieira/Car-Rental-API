package com.carrental.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ErrorMessage {

    private int statusCode;
    private Date timestamp;
    private String message;

}
