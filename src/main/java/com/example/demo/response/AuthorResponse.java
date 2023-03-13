package com.example.demo.response;

import com.example.demo.entity.AuthorEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AuthorResponse extends BaseResponse{
    public AuthorResponse(boolean success, String messege, AuthorEntity author){
        super(success,messege);
        this.author = author;
    }
    public AuthorResponse(AuthorEntity author) {super(true,"Author data");}
    private AuthorEntity author;
}
