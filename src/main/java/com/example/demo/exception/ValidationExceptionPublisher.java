package com.example.demo.exception;

import javax.validation.ValidationException;

public class ValidationExceptionPublisher extends ValidationException {
    public ValidationExceptionPublisher(String message){
        super(message);
    }
}
