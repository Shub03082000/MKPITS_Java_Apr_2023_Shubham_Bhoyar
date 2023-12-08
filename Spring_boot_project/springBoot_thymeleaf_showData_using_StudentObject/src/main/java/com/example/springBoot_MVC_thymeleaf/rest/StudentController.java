package com.example.springBoot_MVC_thymeleaf.rest;

import com.example.springBoot_MVC_thymeleaf.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class StudentController {
    @GetMapping("/register")
    public String register(Model model){
        Student student = new Student();
        model.addAttribute("stud",student);
        return "studform";
    }

    @GetMapping("/processform")
    public String processData(@ModelAttribute ("stud") Student student){
        return "processform";
    }

}
