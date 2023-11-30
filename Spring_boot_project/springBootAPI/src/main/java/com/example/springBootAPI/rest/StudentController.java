package com.example.springBootAPI.rest;

import com.example.springBootAPI.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1001,"shubham","itwari","Nagpur"));
        students.add(new Student(1002,"pranay","dighori","Nagpur"));
        students.add(new Student(1003,"abhishek","dighori","Nagpur"));
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1001,"shubham","itwari","Nagpur"));
        students.add(new Student(1002,"pranay","dighori","Nagpur"));
        students.add(new Student(1003,"abhishek","dighori","Nagpur"));
        return students.get(studentId);
    }
}
