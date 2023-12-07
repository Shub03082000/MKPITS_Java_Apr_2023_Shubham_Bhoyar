package com.example.springBoot_MVC_thymeleaf.entity;


public class Student {
    private int rollNo;
    private String name;
    private String address;
    private String city;
    private String gender;
    private String course;
    public Student(){
    }

    public Student(int rollNo, String name, String address, String city,String course,String gender) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.city = city;
        this.course=course;
        this.gender=gender;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

