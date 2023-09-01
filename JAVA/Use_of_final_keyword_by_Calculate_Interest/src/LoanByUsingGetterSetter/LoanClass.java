package LoanByUsingGetterSetter;

public class LoanClass {
    private String accountNumber;
    private double loanAmount;
    private double loanDuration;

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getLoanDuration(){
        return loanDuration;
    }

    public void setLoanDuration(double loanDuration){
        this.loanDuration = loanDuration;
    }
}
