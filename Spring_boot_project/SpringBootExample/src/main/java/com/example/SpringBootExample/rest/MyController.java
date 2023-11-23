package com.example.SpringBootExample.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private Account account;
//    Constructor injection
    @Autowired
    public MyController(@Qualifier("currentAccount") Account savingAccount) {
        this.account = savingAccount;
    }
//Setter Injection
//    public void setAccount(Account savingAccount) {
//        this.account = savingAccount;
//    }

    @GetMapping("/display")
    public String displayDetails(){
        return account.getDetails();
    }
}
