package com.example.SpringBeanScope.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private Account account1;
    private Account account2;

    @Autowired
    public MyController(@Qualifier("savingAccount")Account account1, @Qualifier("savingAccount")Account account2) {
        this.account1 = account1;
        this.account2 = account2;
    }

    @GetMapping("/check")
    public Boolean checkBeans(){
        return (account1==account2);
    }

    @GetMapping("/check1")
    public String checkBeans1(){
        return "return = " + (account1==account2);
    }
}
