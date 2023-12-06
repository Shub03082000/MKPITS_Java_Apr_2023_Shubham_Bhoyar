package com.example.springboot_RestAPI_CRUD.rest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentController {
    @GetMapping("/register")
    public String register(){
        return "form";
    }

    @GetMapping("/processform")
    public String processData(@RequestParam ("rollNo") int roll_no,
                              @RequestParam ("name") String name,
                              @RequestParam ("address") String address,
                              @RequestParam ("city") String city,
                              Model model){
        model.addAttribute("roll_no",roll_no);
        model.addAttribute("name_",name);
        model.addAttribute("address_",address);
        model.addAttribute("city_",city);
        return "displaydata";
    }
}
