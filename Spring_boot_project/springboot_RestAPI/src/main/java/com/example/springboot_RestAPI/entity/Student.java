package com.example.springboot_RestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @Column(name = "Roll_No")
    private int rollNo;
    @Column(name="Stud_Name")
    private String name;
    @Column(name="Stud_Address")
    private String address;
    @Column(name="City")
    private String city;

    public Student(){
    }

    public Student(int rollNo, String name, String address, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
