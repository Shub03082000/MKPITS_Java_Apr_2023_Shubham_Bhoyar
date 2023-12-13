package com.example.TransactionManagent_sp_.Transactional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_info")
public class Employee {
    @Id
    private int emp_id;
    private String emp_name;

}
