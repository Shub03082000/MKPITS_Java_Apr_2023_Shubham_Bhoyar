package com.example.springboot_RestAPI_CRUD.dao;

import com.example.springboot_RestAPI_CRUD.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student findRecord(Integer rollNo);
    String insertRecord(Student student);
    Student updateRecord(Student student);
    String deleteRecord(Integer rollNo);
}
