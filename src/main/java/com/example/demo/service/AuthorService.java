package com.example.demo.service;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.BookEntity;
import com.example.demo.exception.ValidationExceptionAuthor;
import com.example.demo.repo.AuthorRepo;
import com.example.demo.repo.BookRepo;
import com.example.demo.utils.AuthorValidationUtils;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepo repo;
    public AuthorService (AuthorRepo repo){
        this.repo= repo;

    }
    public AuthorEntity save(AuthorEntity author) throws ValidationExceptionAuthor {
        AuthorValidationUtils.authorValidationUtils(author);
        return repo.save(author);
    }
    public void delete(Long id){repo.deleteById(id);}

    public Iterable<AuthorEntity> getAll(){return repo.findAll();}

    public AuthorEntity find(Long id){return repo.findById(id).get();}
}
