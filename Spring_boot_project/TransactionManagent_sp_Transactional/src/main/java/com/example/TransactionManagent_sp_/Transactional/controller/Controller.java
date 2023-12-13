package com.example.TransactionManagent_sp_.Transactional.controller;

import com.example.TransactionManagent_sp_.Transactional.entity.Employee;
import com.example.TransactionManagent_sp_.Transactional.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee employeeSavedToDB = employeeService.addEmployee(employee);
        return new ResponseEntity<>(employeeSavedToDB, HttpStatus.CREATED);
    }
}
