package com.example.springboot_RestAPI.service;

import com.example.springboot_RestAPI.entity.Student;

import java.util.List;

public interface StudentService{
    List<Student> findAll();
    Student findRecord(Integer rollNo);
}
