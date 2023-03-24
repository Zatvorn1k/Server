package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import com.example.demo.exception.ValidationExceptionBook;
import com.example.demo.repo.BookRepo;
import com.example.demo.utils.BookValidationUtils;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepo repo;
    public BookService (BookRepo repo){
        this.repo= repo;

    }
    public BookEntity save(BookEntity book) throws ValidationExceptionBook {
        BookValidationUtils.bookValidationUtils(book);
        return repo.save(book);
    }
    public void delete(Long id){repo.deleteById(id);}

    public Iterable<BookEntity> getAll(){return repo.findAll();}

    public BookEntity find(Long id){return repo.findById(id).get();}
}
