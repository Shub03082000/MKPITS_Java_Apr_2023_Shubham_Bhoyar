package LoanByUsingConstructor;

public class LoanConstructor {
    private String accountNumber;
    private double loanAmount;
    private double loanDuration;

    public LoanConstructor(String accountNumber, double loanAmount, double loanDuration){
        this.accountNumber = accountNumber;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
    }

    public LoanConstructor() {

    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public  double getLoanDuration(){
        return loanDuration;
    }
}
