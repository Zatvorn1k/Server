package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookListResponse extends BaseResponse{
    public BookListResponse(Iterable<BookEntity> data) {
        super(true,"Книги");
        this.data = data;
    }
    private Iterable<BookEntity> data;
}
