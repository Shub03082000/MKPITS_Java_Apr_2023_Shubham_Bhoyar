package com.example.springboot_RestAPI_CRUD.dao;

import com.example.springboot_RestAPI_CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "data-api")
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
