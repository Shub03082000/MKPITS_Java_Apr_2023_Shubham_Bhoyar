package com.example.oneToOne_relationship_springboot.service;

import com.example.oneToOne_relationship_springboot.entity.Student;

import java.util.List;

public interface StudentService {
    String save(Student student);
    List<Student> findAll();
    Student findById(Integer rollno);
    String deleteById(Integer rollno);
    Student updateRecord(Student student);
}
