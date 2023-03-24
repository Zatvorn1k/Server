package com.example.demo.service;

import com.example.demo.entity.BookEntity;
import com.example.demo.entity.PublisherEntity;
import com.example.demo.exception.ValidationExceptionPublisher;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.PublisherRepo;
import com.example.demo.utils.PublisherValidationUtils;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    private final PublisherRepo repo;
    public PublisherService (PublisherRepo repo){
        this.repo= repo;

    }
    public PublisherEntity save(PublisherEntity publisher) throws ValidationExceptionPublisher {
        PublisherValidationUtils.publisherValidationUtils(publisher);
        return repo.save(publisher);
    }
    public void delete(Long id){repo.deleteById(id);}

    public Iterable<PublisherEntity> getAll(){return repo.findAll();}

    public PublisherEntity find(Long id){return repo.findById(id).get();}
}

