package com.example.demo.controller;

import com.example.demo.entity.PublisherEntity;
import com.example.demo.response.BaseResponse;
import com.example.demo.service.PublisherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/publish")
public class PublisherController {
    private final PublisherService service;

    public PublisherController(PublisherService service) { this.service = service;}

    @PostMapping("/add")
    public ResponseEntity<BaseResponse> save(@RequestBody PublisherEntity data){
        try{
            PublisherEntity temp = service.save(data);
            return ResponseEntity.ok(new BaseResponse( true,"Издательство добавлено"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
    @PostMapping("/update")
    public ResponseEntity<BaseResponse> update(@RequestBody PublisherEntity data) {
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
            return ResponseEntity.ok(new BaseResponse(true, "Издательство удалено"));
        } catch (Exception e){
            return ResponseEntity.badRequest().body(new BaseResponse(false, e.getMessage()));
        }
    }
}
