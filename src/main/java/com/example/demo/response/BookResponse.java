package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookResponse extends BaseResponse {
    public BookResponse(boolean success, String message, BookEntity book){
        super(success, message);
        this.book = book;
    }
    public BookResponse(BookEntity publisher) {
        super(true, "Publishing data");
    }
    private BookEntity book;
}

