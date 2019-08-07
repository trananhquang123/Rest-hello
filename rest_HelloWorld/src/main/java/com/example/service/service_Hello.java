package com.example.service;

import com.example.entitys.hello_Entity;
import com.example.repository.repository_Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service_Hello{

    @Autowired
    private repository_Hello  repositoryHello;

    public List<hello_Entity> hello() {
        return repositoryHello.findAll();
    }

    public hello_Entity save(hello_Entity hello){
        return repositoryHello.save(hello);
    }
}
