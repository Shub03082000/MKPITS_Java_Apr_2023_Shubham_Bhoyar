package com.example.banking_application_jsp;
import java.sql.Timestamp;
import java.util.Date;
public class BankAccount_details {
    private String userName;
    private String password;
    private String name;
    private String address;
    private String city;
    private int balance;
    private Timestamp createdOn;
    private Timestamp Approved_at;
    private String Approved_by;


    public BankAccount_details() {
    }

    public Timestamp getApproved_at() {
        return Approved_at;
    }

    public void setApproved_at(Timestamp approved_at) {
        Approved_at = approved_at;
    }

    public String getApproved_by() {
        return Approved_by;
    }

    public void setApproved_by(String approved_by) {
        Approved_by = approved_by;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
