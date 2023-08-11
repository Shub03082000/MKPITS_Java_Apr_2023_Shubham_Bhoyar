package BankClassExceptionHandling;

import com.sun.security.jgss.GSSUtil;

public class MainBank {
    public static void main(String[] args) {
        BankClassExceptionHandling bankClass = new BankClassExceptionHandling(10000);
//        bank.deposit(500);
        System.out.println("Balance : " + bankClass.getBalance());
        try {
            bankClass.deposit(500);
        } catch (InvalidBalance e) {
            System.out.println(e.getMessage());
        }
        try {
            bankClass.withdraw(300);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance : " + bankClass.getBalance());

    }
}
