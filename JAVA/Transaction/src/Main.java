
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================= Welcome to Bank Of India =========================");
        System.out.println("Bank Name : " + BankDetails.bankName);
        System.out.println("IFSC Code : " + BankDetails.ifscCode);
        System.out.println("Bank Code : " + BankDetails.bankCode);
        System.out.println("MICR Code : " + BankDetails.micrCode);

//================================ Customer Class Object ==================================//
//        System.out.println("Enter account Number : ");
//        Customer customer1 = new Customer(scanner.next(),scanner.next(), 12000.0);
        Customer customer1 = new Customer("374892374923","Shubham", 12000.0);
//        Customer customer2 = new Customer("374893443313","Aniket", 10000.0);
//        Customer customer1 = new Customer(scanner.next(),scanner.next(), 12000.0);
//        Customer customer2 = new Customer(scanner.next(),scanner.next(), 10000.0);
        customer1.displayDetails();

        Transaction transaction1 = new Transaction();
//============================ Deposit Amount ==============================================//
        System.out.println("Enter deposit amount : ");
        try {
            transaction1.deposit1(customer1,scanner.nextInt());
        } catch (InsufficientBalance e) {
            throw new RuntimeException(e);
        }
        customer1.displayDetails();

//============================ Withdraw Amount ===========================================//
        System.out.println("Enter withdraw amount : ");
        try {
            transaction1.withdraw1(customer1,scanner.nextInt());
        } catch (InvalidBalance e) {
            throw new RuntimeException(e);
        }
        customer1.displayDetails();

//============================= 2nd Customer Details =====================================//
//        System.out.println("\n");
//        System.out.println("===================== 2nd Customer Details ===================");

//        Transaction transaction2 = new Transaction();
//============================ Deposit Amount ==============================================//
//        System.out.println("Enter deposit amount : ");
//        transaction2.deposit2(customer2,scanner.nextInt());
//        customer2.displayDetails();

//============================ Withdraw Amount ===========================================//
//        System.out.println("\n");
//        System.out.println("Enter withdraw amount : ");
//        transaction2.withdraw2(customer2,scanner.nextInt());
//        customer2.displayDetails();


//============================ Transfer Amount ===========================================//
//        System.out.println("Transfer amount from customer1 account to customer2 account : ");
//        transaction1.transfer(customer1,customer2, scanner.nextInt());
//        customer1.displayDetails();
//        customer2.displayDetails();
//        System.out.println("Transfer amount from customer2 account to customer1 account : ");
//        transaction2.transfer(customer2,customer1,scanner.nextInt());
//        customer1.displayDetails();
//        customer2.displayDetails();
    }
}