package com.example.SB_Hibernate_Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int Roll_No;
    private String Stud_Name;
    private String Stud_Address;
    private String City;

    public Student() {
    }

    public Student(String stud_Name, String stud_Address, String city) {
        Stud_Name = stud_Name;
        Stud_Address = stud_Address;
        City = city;
    }
}
