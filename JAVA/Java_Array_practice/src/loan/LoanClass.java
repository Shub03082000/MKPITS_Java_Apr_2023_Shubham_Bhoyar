package loan;

public class LoanClass {
    private String accountNumber;
    private double duration;
    private double loanAmount;

    public LoanClass(double loanAmount, String accountNumber, double duration) {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public LoanClass(String accountNumber, double duration, double loanAmount) {
        this.accountNumber = accountNumber;
        this.duration = duration;
        this.loanAmount = loanAmount;
    }

    public LoanClass(){
        accountNumber = "BOI54894798";
        duration = 2.5;
        loanAmount = 100000;
    }
}
