package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
///asd

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "book")
public class BookEntity {
    @Column(name = "book_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String title;
    @NotBlank
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private PublisherEntity publisher;
    private int year;
    private String kind;
}
