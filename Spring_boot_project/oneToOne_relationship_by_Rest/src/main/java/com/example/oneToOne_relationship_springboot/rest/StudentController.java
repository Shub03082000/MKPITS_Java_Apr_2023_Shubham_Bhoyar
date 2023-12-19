package com.example.oneToOne_relationship_springboot.rest;

import com.example.oneToOne_relationship_springboot.entity.Address;
import com.example.oneToOne_relationship_springboot.entity.Student;
import com.example.oneToOne_relationship_springboot.service.AddressService;
import com.example.oneToOne_relationship_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;
    private AddressService addressService;
    @Autowired
    public StudentController(StudentService studentService,  AddressService addressService) {
        this.studentService = studentService;
        this.addressService=addressService;
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

    @GetMapping("/students")
    public List<Student> displayStudentFromAddress(){
        List<Student> addresses = studentService.findAll();
        return addresses;
    }

//------------ display student from roll_no ----------------------------------
    @GetMapping("/students/{rollno}")
    public Student findById(@PathVariable Integer rollno){
        Student student = studentService.findById(rollno);
        return student;
    }

//----------- find students details from address_id ---------------------------------
    @GetMapping("/student/{address_id}")
    public Student findAddress(@PathVariable int address_id){
       Address address = addressService.findByAddressid(address_id);
       return address.getStudent();
    }

//---------- delete particular student details from roll_no --------------------------------------
    @DeleteMapping("/students/{rollno}")
    public String deleteById(@RequestBody @PathVariable Integer rollno){
        studentService.deleteById(rollno);
        return "Record deleted";
    }

    @DeleteMapping("/address/{address_id}")
    public void deleteAddressById(@PathVariable int address_id){
        Address address = addressService.findByAddressid(address_id);
        Student student  = address.getStudent();
        student.setAddress(null);
        addressService.deleteAddressFromId(address_id);
    }

//--------- update student ---------------------------------------------------
    @PutMapping("/student")
    public Student updateRecord(@RequestBody Student student){
        return studentService.updateRecord(student);
    }
}
