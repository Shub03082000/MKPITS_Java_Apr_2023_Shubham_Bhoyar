package com.example.oneToOne_relationship_springboot.rest;

import com.example.oneToOne_relationship_springboot.entity.Address;
import com.example.oneToOne_relationship_springboot.entity.Student;
import com.example.oneToOne_relationship_springboot.service.StudentService;
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

//    @PostMapping("/students")
//    public void saveRecord(){
//        Address address = new Address("dighori","Nagpur");
//        Student student = new Student(1003,"teju",address);
//        String string = studentService.save(student);
//        System.out.println(string);
//    }

    @PostMapping("/students")
    public void saveRecord(@RequestBody Student student){
        studentService.save(student);
    }

    @GetMapping("/studentlist")
    public List<Student> displayStudents(){
        List<Student> student = studentService.findAll();
        return student;
    }

    @GetMapping("/student/{address_id}")
    public Student findById(@PathVariable Integer address_id){
        Student student = studentService.findById(address_id);
        return student;
    }

    @DeleteMapping("students/{address_id}")
    public String deleteById(@RequestBody @PathVariable Integer address_id){
        studentService.deleteById(address_id);
        return "Record deleted";
    }

    @PutMapping("/student")
    public Student updateRecord(@RequestBody Student student){
        return studentService.updateRecord(student);
    }
}
