package com.example.springboot_RestAPI_CRUD.service;

import com.example.springboot_RestAPI_CRUD.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findRecord(Integer rollNo);
    String insertRecord(Student student);
    Student updateRecord(Student student);
    String deleteRecord(Integer rollNo);
}
