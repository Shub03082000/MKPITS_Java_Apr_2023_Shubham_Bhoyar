package com.example.springboot_RestAPI_CRUD.dao;

import com.example.springboot_RestAPI_CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
