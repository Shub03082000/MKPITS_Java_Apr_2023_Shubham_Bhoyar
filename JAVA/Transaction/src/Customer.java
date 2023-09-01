public class Customer {
    private String accountNumber;
    private String name;
    private double balance;

    public Customer(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    void displayDetails(){
        System.out.println(getName());
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }

}
