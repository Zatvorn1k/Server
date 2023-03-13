package com.example.demo.repo;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<AuthorEntity, Long> {
}
