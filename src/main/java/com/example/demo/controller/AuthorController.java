package com.example.demo.controller;

import com.example.demo.entity.AuthorEntity;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) { this.service = service;}

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> save(@RequestBody AuthorEntity data){
        try{
            AuthorEntity temp = service.save(data);
            return ResponseEntity.ok(new BaseResponse( true,"Автор добавлен"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
    @PostMapping("/update")
    public ResponseEntity<BaseResponse> update(@RequestBody AuthorEntity data) {
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
            return ResponseEntity.ok(new BaseResponse(true, "Автор удален"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
}
