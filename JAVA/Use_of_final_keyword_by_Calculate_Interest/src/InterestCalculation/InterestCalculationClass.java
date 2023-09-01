package InterestCalculation;

import LoanByUsingGetterSetter.LoanClass;

public class InterestCalculationClass {
    private final double rateOfInterest;
    private int time;

//    public final double calculateInterest(String accountNumber, double loanAmount, double loanDuration){
//        System.out.println("Account number is : " + accountNumber);
//        return (loanAmount * (1 + rateOfInterest * time));
//    }

    public final double calculateInterest(LoanClass loan){
        System.out.println("Account number is : " + loan.getAccountNumber());
        return (loan.getLoanAmount() * (1 + rateOfInterest * loan.getLoanDuration()));
    }

    public InterestCalculationClass() {
        rateOfInterest = 20;
    }

    public void calculateInterest(String accountNumber, double loanAmount, double loanDuration) {
    }
}

