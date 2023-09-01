package LoanByUsingObject;

public class Loan {
    private String accountNumber;
    private double loanAmount;
    private double duration;

    public Loan(String accountNumber, double loanAmount, double duration){
        this.accountNumber = accountNumber;
        this.loanAmount = loanAmount;
        this.duration = duration;
    }
}
