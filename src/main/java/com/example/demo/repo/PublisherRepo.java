package com.example.demo.repo;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.PublisherEntity;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<PublisherEntity, Long> {
}
