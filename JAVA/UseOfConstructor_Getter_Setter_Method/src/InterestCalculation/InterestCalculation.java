package InterestCalculation;

import LoanByUsingObject.Loan;

public final class InterestCalculation {
    private final double interestRate=10;
    private  double interest;




    public final double calculateInterest(Loan loan){

        interest=loan.getLoanAmount()*loan.getDuration()*interestRate;
        return interest;
    }
}
