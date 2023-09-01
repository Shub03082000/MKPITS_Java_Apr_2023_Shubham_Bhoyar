public class Transaction {
    public void deposit1(Customer customer1, double amount) throws InsufficientBalance{
        if(amount > customer1.getBalance())
            throw new InsufficientBalance();
        double depositAmount = customer1.setBalance(customer1.getBalance() + amount);
        System.out.println("Balance after deposit amount : " + depositAmount);
    }

    public void withdraw1(Customer customer1, double amount) throws InvalidBalance{
        if(amount < 100)
            throw new InvalidBalance();
        double withdrawAmount = customer1.setBalance(customer1.getBalance() - amount);
        System.out.println("Balance after withdraw amount : " + withdrawAmount);
    }

//    public void deposit2(Customer customer2, double amount){
//        double depositAmount = customer2.setBalance(customer2.getBalance() + amount);
//        System.out.println("Balance after deposit amount : " + depositAmount);
//    }
//
//    public void withdraw2(Customer customer2, double amount){
//        double withdrawAmount = customer2.setBalance(customer2.getBalance() - amount);
//        System.out.println("Balance after withdraw amount : " + withdrawAmount);
//    }

    public void transfer(Customer customer1,Customer customer2, double amount){
        customer1.setBalance(customer1.getBalance()-amount);
        customer2.setBalance(customer2.getBalance()+amount);
    }
}
