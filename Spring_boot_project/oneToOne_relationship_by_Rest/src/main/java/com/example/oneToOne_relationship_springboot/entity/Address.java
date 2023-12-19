package com.example.oneToOne_relationship_springboot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressid;
    private String address;
    private String city;

    @JsonBackReference
    @OneToOne(mappedBy = "address",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private Student student;

    public Address(){

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Address(String address, String city, Student student) {
        this.address = address;
        this.city = city;
        this.student=student;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
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
