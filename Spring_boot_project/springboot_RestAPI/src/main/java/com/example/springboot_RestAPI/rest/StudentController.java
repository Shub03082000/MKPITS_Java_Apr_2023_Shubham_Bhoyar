package com.example.springboot_RestAPI.rest;

import com.example.springboot_RestAPI.dao.StudentDao;
import com.example.springboot_RestAPI.entity.Student;
import com.example.springboot_RestAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.findAll();
    }

    @GetMapping("/students/{rollNo}")
    public Student getStudent(@PathVariable int rollNo){
        return studentService.findRecord(rollNo);
    }

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student){
        return  studentService.save(student);
    }

    @PutMapping("/students")
    public Student updateStudents(@RequestBody Student student){
        return studentService.updateRecord(student);
    }

    @DeleteMapping("/students/{rollNo}")
    public String removeStudent(@RequestBody @PathVariable Integer rollNo){
        return studentService.deleteRecord(rollNo);
    }
}
