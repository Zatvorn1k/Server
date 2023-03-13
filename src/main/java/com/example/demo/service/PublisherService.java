package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import com.example.demo.entity.PublisherEntity;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.PublisherRepo;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    private final PublisherRepo repo;

    public PublisherService(PublisherRepo repo) {
        this.repo = repo;
    }

    public Iterable<PublisherEntity> getAll() {
        return repo.findAll();
    }
    public PublisherEntity save(PublisherEntity book){
        return repo.save(book);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
