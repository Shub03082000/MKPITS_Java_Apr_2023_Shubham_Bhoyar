import InterestCalculation.InterestCalculationClass;
import LoanByUsingConstructor.LoanConstructor;
import LoanByUsingGetterSetter.LoanClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter loan amount = ");
        double loneAmount=scanner.nextDouble();
        System.out.println("Enter time duration = ");
        double time= scanner.nextDouble();
        System.out.println("Enter Account number = ");
        String accountNumber=scanner.next();
        System.out.println("=========== ******************** ==================");
// -------------------- By Using Constructor -------------------------------------------
        LoanConstructor loanConstructor = new LoanConstructor(accountNumber,loneAmount,time);
        InterestCalculationClass interestCalculationClass = new InterestCalculationClass();
        interestCalculationClass.calculateInterest(loanConstructor.getAccountNumber(), loanConstructor.getLoanAmount(), loanConstructor.getLoanDuration());


        // -------------------- By Using setter getter -------------------------------------------
        LoanClass loanClass = new LoanClass();
        loanClass.setAccountNumber(accountNumber);
        loanClass.setLoanAmount(loneAmount);
        loanClass.setLoanDuration(time);

        InterestCalculationClass interestCalculation = new InterestCalculationClass();
        int interest = interestCalculation.calculateInterest(loanConstructor.getAccountNumber(), loanClass.getLoanAmount(), loanClass.getLoanDuration());

        //-------------------By using objects we can get the information-----------------
        LoanClass lone=new LoanClass(accountNumber,loneAmount,time);
        InterestCalculationClass interestCalculation=new InterestCalculationClass();
        double interest= interestCalculationClass.calculateInterest(loanClass);
        System.out.println("Calculate Interest = "+interest);

    }
}