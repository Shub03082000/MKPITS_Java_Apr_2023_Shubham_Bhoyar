public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public  double deposit(int amount) {
            balance = balance + amount;
            return balance;
    }

    public  double withdraw(int amount) throws InsufficientBalance {
        if (amount < 500) {
            throw new InsufficientBalance();
        }
            balance=balance-amount;
            return balance;
        }
    }

