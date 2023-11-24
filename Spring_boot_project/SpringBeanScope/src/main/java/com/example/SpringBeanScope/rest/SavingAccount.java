package com.example.SpringBeanScope.rest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SavingAccount implements Account{

    public SavingAccount(){
        System.out.println("This is savingAccount Constructor");
    }
    @Override
    public String getDetails() {
        return "This is saving account";
    }

}
