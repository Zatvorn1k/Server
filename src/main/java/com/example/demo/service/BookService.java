package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import com.example.demo.repo.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo repo;

    public BookService(BookRepo repo) {
        this.repo = repo;
    }

    public Iterable<BookEntity> getAll() {
        return repo.findAll();
    }
    public BookEntity save(BookEntity book){
        return repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}
