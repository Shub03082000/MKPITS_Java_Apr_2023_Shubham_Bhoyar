package InterestCalculator;

import loan.LoanClass;

import java.util.Scanner;

public class MainInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter loan amount : ");
        double loanAmount = scanner.nextDouble();
        System.out.println("Enter Duration : ");
        double duration = scanner.nextDouble();
        System.out.println("Enter account number : ");
        String accountNumber = scanner.nextLine();

        LoanClass loanClass = new LoanClass(loanAmount,accountNumber,duration);
        loanClass.setLoanAmount(200000);
        loanClass.setDuration(2);
        loanClass.setAccountNumber("BOI7324387");
        InterestCalculation interest = new InterestCalculation();
        interest.CalculateInterest(loanClass.getLoanAmount(),loanClass.getDuration(),loanClass.getAccountNumber());
    }
}
