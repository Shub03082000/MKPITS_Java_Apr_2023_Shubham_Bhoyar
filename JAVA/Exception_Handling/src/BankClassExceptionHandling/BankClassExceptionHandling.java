package BankClassExceptionHandling;

import Bank.InsufficientBalance;
import Bank.InvalidBalance;

public class BankClassExceptionHandling {
    private int balance;

    public BankClassExceptionHandling(int balance) {
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) throws InvalidBalance{
        if(amount<100)
            throw new InvalidBalance();
        balance = balance + amount;
        System.out.println("Balance after deposit amount : " + balance);
    }

    public void withdraw(int amount) throws InsufficientBalance{
        if(balance < amount)
            throw new InsufficientBalance();
        balance = balance - amount;
        System.out.println("Balance after withdraw : " + balance);
    }
}
