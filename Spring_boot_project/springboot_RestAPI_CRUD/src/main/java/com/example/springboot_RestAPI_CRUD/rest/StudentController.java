package com.example.springboot_RestAPI_CRUD.rest;

import com.example.springboot_RestAPI_CRUD.entity.Student;
import com.example.springboot_RestAPI_CRUD.service.StudentService;
import jakarta.transaction.Transactional;
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
    public Student getStudent(@PathVariable Integer rollNo){
       return studentService.findRecord(rollNo);
    }

    @PostMapping("/students")
    public String insertStudent(@RequestBody Student student){
        return studentService.insertRecord(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateRecord(student);
    }

    @DeleteMapping("students/{rollNo}")
    public String deleteStudent(@RequestBody @PathVariable Integer rollNo){
        return studentService.deleteRecord(rollNo);
    }
}
