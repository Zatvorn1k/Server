package com.example.demo.response;

import com.example.demo.entity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthorListResponse extends BaseResponse{
    public AuthorListResponse(Iterable<BookEntity> data){
        super(true,"Авторы");
        this.data = data;
    }

    private Iterable<BookEntity> data;
}
