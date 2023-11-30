package com.example.springboot_RestAPI.rest;

import com.example.springboot_RestAPI.entity.Student;
import com.example.springboot_RestAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.findAll();
    }

    @GetMapping("/student/{rollNo}")
    public Student getStudentList(@PathVariable int rollNo){
        return studentService.findRecord(rollNo);
    }
}
