package com.example.springboot_RestAPI.dao;

import com.example.springboot_RestAPI.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student findRecord(Integer rollNo);
    String save(Student student);
    Student updateRecord(Student student);
    String deleteRecord(Integer rollNo);
}
