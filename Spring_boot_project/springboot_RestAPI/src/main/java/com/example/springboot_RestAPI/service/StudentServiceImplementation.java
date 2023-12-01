package com.example.springboot_RestAPI.service;

import com.example.springboot_RestAPI.dao.StudentDao;
import com.example.springboot_RestAPI.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    private StudentDao studentDao;

    @Autowired
    public StudentServiceImplementation(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findRecord(Integer rollNo) {
        return studentDao.findRecord(rollNo);
    }

    @Override
    @Transactional
    public String save( Student student) {
       return studentDao.save(student);
    }

    @Override
    @Transactional
    public Student updateRecord(Student student) {
        return studentDao.updateRecord(student);
    }

    @Override
    @Transactional
    public String deleteRecord(Integer rollNo) {
        return studentDao.deleteRecord(rollNo);
    }
}
