package com.example.oneToOne_relationship_springboot.service;

import com.example.oneToOne_relationship_springboot.entity.Student;
import com.example.oneToOne_relationship_springboot.repo.StudentRepository;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService{

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public String save(Student student) {
        studentRepository.save(student);
        return "Record inserted";
    }
}
