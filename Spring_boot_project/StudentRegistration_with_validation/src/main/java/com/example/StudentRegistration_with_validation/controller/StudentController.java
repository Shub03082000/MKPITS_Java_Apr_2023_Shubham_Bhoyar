package com.example.StudentRegistration_with_validation.controller;

import com.example.StudentRegistration_with_validation.entity.Student;
import com.example.StudentRegistration_with_validation.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//-------------------------------- Display Student Record ---------------------------------------------
//    @GetMapping("/list")
//    public String displayStudent(Model model){
//        List<Student> list = studentService.displayAll();
//        model.addAttribute("students",list);
//        return "homepage";
//    }

//------------------------------ Save record in Student table -----------------------------------------
    @GetMapping("/addStudent")
    public String getForm(Model model){
        Student student = new Student();
        model.addAttribute("stud",student);
        return "newStudent";
    }

    @PostMapping("/save")
    public String saveRecord(@ModelAttribute("stud") Student student){
        studentService.saveStudent(student);
        return "redirect:/students/list";
    }

//------------------------- Update Student Record from Student Table ----------------------------------------

    @GetMapping("/studFormForUpdate")
    public String studFormForUpdate(@RequestParam("rollNo") int rn, Model model){
        Student student = studentService.updateRecord(rn);
        model.addAttribute("stud",student);
        return "newStudent";
    }

//------------------------ Delete Student Record from Student Table ------------------------------------
    @GetMapping("/deleteStudentData")
    public String deleteStudentData(@RequestParam("rollNo") int rn){
        studentService.deleteRecord(rn);
        return "redirect:/students/list";
    }

//------------------------ Pagination for Student table -----------------------------------------------
    @GetMapping("/list")
    public String getStudentPagination(@PageableDefault(size = 5)Pageable pageable, Model model){
        Page<Student> page = studentService.getStudentPagination(pageable);
        model.addAttribute("pageStudent",page);
        return "homepage";
    }
}
