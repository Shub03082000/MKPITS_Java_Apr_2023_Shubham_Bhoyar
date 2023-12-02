package com.example.springboot_RestAPI_CRUD.service;

import com.example.springboot_RestAPI_CRUD.dao.StudentRepository;
import com.example.springboot_RestAPI_CRUD.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findRecord(Integer rollNo) {
        Optional optional = studentRepository.findById(rollNo);
        Student student = (Student) optional.get();
        return student;
    }

    @Override
    @Transactional
    public String insertRecord(Student student) {
        studentRepository.save(student);
        return "insert successfully";
    }

    @Override
    @Transactional
    public Student updateRecord(Student student, Integer rollNo) {
        Student student1 = studentRepository.findById(rollNo).get();
        System.out.println(student1);
        studentRepository.save(student);
        System.out.println("Record updated successfully");
        return student;
    }

    @Override
    @Transactional
    public String deleteRecord(Integer rollNo) {
        Optional optional = studentRepository.findById(rollNo);
        Student student = (Student) optional.get();
        studentRepository.delete(student);
        return "Record deleted";
    }
}
