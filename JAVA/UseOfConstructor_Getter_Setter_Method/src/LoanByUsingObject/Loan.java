package LoanByUsingObject;

public class Loan {
    private final String accNumber;
    private final double loanAmount;
    private final int duration;

    public String getAccNumber() {
        return accNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getDuration() {
        return duration;
    }

//    public void setAccNumber(String accNumber) {
//        this.accNumber = accNumber;
//    }
//
//    public void setLoanAmount(double loanAmount) {
//        this.loanAmount = loanAmount;
//    }
//
//    public void setDuration(int duration) {
//        this.duration = duration;
//    }

    public Loan(String accNumber, double loanAmount, int duration) {
        this.accNumber = accNumber;
        this.loanAmount = loanAmount;
        this.duration = duration;
    }

}
