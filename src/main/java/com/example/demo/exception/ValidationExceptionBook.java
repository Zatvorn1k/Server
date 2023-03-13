package com.example.demo.exception;

import javax.validation.ValidationException;

public class ValidationExceptionBook extends ValidationException {
    public ValidationExceptionBook(String message){
        super(message);
    }
}
