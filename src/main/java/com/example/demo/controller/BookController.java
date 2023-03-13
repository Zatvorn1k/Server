package com.example.demo.controller;

import com.example.demo.entity.BookEntity;
import com.example.demo.response.AuthorListResponse;
import com.example.demo.response.BaseResponse;
import com.example.demo.response.BookListResponse;
import com.example.demo.response.BookResponse;
import com.example.demo.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService service;

    public BookController(BookService service) { this.service = service;}

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> save(@RequestBody BookEntity data){
        try{
            return ResponseEntity.ok(new BaseResponse( true,"Книга добавлена"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
    @PostMapping("/update")
    public ResponseEntity<BaseResponse> update(@RequestBody BookEntity data) {
        try {
            service.save(data);
            return ResponseEntity.ok(new BaseResponse(true, "Изменения внесены"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BaseResponse> delete(@PathVariable("id") long id){
        try{
            System.out.println(id);
            service.delete(id);
            return ResponseEntity.ok(new BaseResponse(true, "Книга удалена"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
    @GetMapping("/all")
    public ResponseEntity<BaseResponse> getAll(){
        return ResponseEntity.ok(new AuthorListResponse(service.getAll()));
    }
}

