import InterestCalculation.InterestCalculation;
import LoanByUsingObject.Loan;

public class Main {
    public static void main(String[] args) {
        Loan loan=new Loan("12345789",1000,1);
//        Loan loan=new Loan();
//        loan.setLoanAmount(1000);
//        loan.setAccNumber("123caCG");
//        loan.setDuration(5);
        InterestCalculation interestCalculation=new InterestCalculation();
        double finalResult= interestCalculation.calculateInterest(loan);
        System.out.println(finalResult);


    }
}