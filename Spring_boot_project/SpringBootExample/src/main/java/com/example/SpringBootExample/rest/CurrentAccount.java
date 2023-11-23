package com.example.SpringBootExample.rest;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account{

    @Override
    public String getDetails() {
        return "This is Current Account";
    }
}
