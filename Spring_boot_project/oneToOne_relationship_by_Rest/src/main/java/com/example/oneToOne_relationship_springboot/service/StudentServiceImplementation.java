package com.example.oneToOne_relationship_springboot.service;

import com.example.oneToOne_relationship_springboot.entity.Student;
import com.example.oneToOne_relationship_springboot.repo.StudentRepository;
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
    @Transactional
    public String save(Student student) {
        studentRepository.save(student);
        return "Record inserted";
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Integer address_id) {
        Optional optional = studentRepository.findById(address_id);
        Student student = (Student) optional.get();
        return student;
    }

    @Override
    @Transactional
    public String deleteById(Integer address_id) {
        Optional optional = studentRepository.findById(address_id);
        Student student = (Student) optional.get();
        studentRepository.delete(student);
        return "Record deleted successfully";
    }

    @Override
    @Transactional
    public Student updateRecord(Student student) {
        Optional<Student> student1 = studentRepository.findById(student.getRollno());
        if(student1.isPresent()){
            studentRepository.save(student);
            System.out.println("Record updated successfully");
        }else {
            System.out.println("Record not found");
        }
        return student;
    }
}
