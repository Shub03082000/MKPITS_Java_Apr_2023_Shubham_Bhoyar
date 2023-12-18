package com.example.oneToOne_relationship_springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_info")
public class Student {
    @Id
    private int rollno;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_address_address_id")
    private Address address;

    public Student(){

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(int rollno, String name,Address address) {
        this.rollno = rollno;
        this.name = name;
        this.address=address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
