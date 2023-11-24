package com.example.SpringBeanScope.rest;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account {

    public CurrentAccount(){
        System.out.println("This is currentAccount Constructor");
    }

    @Override
    public String getDetails() {
        return "This is Current Account";
    }
}
