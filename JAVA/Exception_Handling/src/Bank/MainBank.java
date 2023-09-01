package Bank;

import com.sun.security.jgss.GSSUtil;

import BankClassExceptionHandling.BankClassExceptionHandling;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank(10000);
//        bank.deposit(500);
        System.out.println("Balance : " + bank.getBalance());
        try {
            bank.deposit(500);
        } catch (InvalidBalance e) {
            System.out.println(e.getMessage());
        }
        try {
            bank.withdraw(300);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Balance : " + bank.getBalance());

    }
}
