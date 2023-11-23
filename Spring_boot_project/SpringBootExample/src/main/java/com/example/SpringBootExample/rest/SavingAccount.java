package com.example.SpringBootExample.rest;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SavingAccount implements Account{
    @Override
    public String getDetails() {
        return "This is Saving account";
    }
}
