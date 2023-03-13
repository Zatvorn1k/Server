package com.example.demo.service;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.BookEntity;
import com.example.demo.repo.AuthorRepo;
import com.example.demo.repo.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepo repo;

    public AuthorService(AuthorRepo repo) {
        this.repo = repo;
    }

    public Iterable<AuthorEntity> getAll() {
        return repo.findAll();
    }
    public AuthorEntity save(AuthorEntity book){
        return repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
