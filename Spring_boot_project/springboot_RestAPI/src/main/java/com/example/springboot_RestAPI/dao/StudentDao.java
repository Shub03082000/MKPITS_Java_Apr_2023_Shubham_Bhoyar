package com.example.springboot_RestAPI.dao;

import com.example.springboot_RestAPI.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
}
