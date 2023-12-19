package com.example.oneToOne_relationship_springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressid;
    private String address;
    private String city;

    public Address(){

    }

    public Address(String address, String city) {
        this.address = address;
        this.city = city;
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

    @Override
    public String toString() {
        return "Address{" +
                "addressid=" + addressid +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
