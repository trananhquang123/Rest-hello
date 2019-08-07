package com.example.repository;

import com.example.entitys.hello_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository_Hello extends JpaRepository<hello_Entity,Long> {

}
