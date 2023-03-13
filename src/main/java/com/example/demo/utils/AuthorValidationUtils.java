package com.example.demo.utils;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.BookEntity;
import com.example.demo.exception.ValidationExceptionAuthor;
import com.example.demo.exception.ValidationExceptionBook;

public class AuthorValidationUtils {
    public static void authorValidationUtils (AuthorEntity author) {
        String name = author.getName();
        if (name == null || name.isBlank()) {
            throw new ValidationExceptionAuthor("Нужно выбрать имя");
        }
        if (author.getLastname() == null) {
            throw new ValidationExceptionAuthor("Нужно выбрать Фамилия");
        }
        if (author.getSurname() == null) {
            throw new ValidationExceptionAuthor("Нужно выбрать Отчество");
        }
    }
}
