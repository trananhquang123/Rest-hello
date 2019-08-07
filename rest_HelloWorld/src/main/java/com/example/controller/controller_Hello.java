package com.example.controller;

import com.example.entitys.hello_Entity;
import com.example.repository.repository_Hello;
import com.example.service.service_Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class controller_Hello {

    @Autowired
    service_Hello serviceHello;

    @GetMapping("/helloworld")
    public List<hello_Entity> hello1( ){
       return serviceHello.hello();
    }

    @PostMapping("/add-hello")
    public ResponseEntity<hello_Entity> addHello(@RequestBody hello_Entity addhello){
        hello_Entity  hello = serviceHello.save(addhello);

        return ResponseEntity.ok().body(hello);
    }
}
