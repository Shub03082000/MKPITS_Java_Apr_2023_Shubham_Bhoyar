package BankClass;

public class BankClass {
    private double balance;

    public BankClass(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(int amount) throws InvalidBalance{
        if(amount < 100)
            throw new InvalidBalance();
        balance = balance + amount;
        return balance;
    }

    public double withdraw(int amount) throws InsufficientBalance{
        if(amount > balance)
            throw new InsufficientBalance();
        balance = balance - amount;
        return balance;
    }
}
