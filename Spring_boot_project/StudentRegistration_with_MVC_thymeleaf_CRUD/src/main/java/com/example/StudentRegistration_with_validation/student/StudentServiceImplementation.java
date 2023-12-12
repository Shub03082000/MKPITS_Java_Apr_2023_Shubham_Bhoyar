package com.example.StudentRegistration_with_validation.student;

import com.example.StudentRegistration_with_validation.Repository.StudentRepository;
import com.example.StudentRegistration_with_validation.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class StudentServiceImplementation implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> displayAll() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    @Transactional
    public Student updateRecord(Integer roll_no) {
        Student student = studentRepository.findById(roll_no).get();
        return student;

    }

    @Override
    @Transactional
    public void deleteRecord(Integer roll_no) {
        Student student = studentRepository.findById(roll_no).get();
        studentRepository.delete(student);
    }

}
