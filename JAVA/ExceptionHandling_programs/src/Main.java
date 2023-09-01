import BankClass.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter balance amount : ");
        BankClass bankClass = new BankClass(scanner.nextInt());
        int amount = scanner.nextInt();
        System.out.println(bankClass.getBalance());
        try {
            System.out.println("Enter deposit amount : ");
            System.out.println("Deposit : " + bankClass.deposit(scanner.nextInt()));
            System.out.println("Enter withdraw amount : ");
            System.out.println("Withdraw : " + bankClass.withdraw(scanner.nextInt()));
        }catch (InvalidBalance i){
            System.out.println(i);
        }catch (InsufficientBalance i){
            System.out.println(i);
        }

    }
}