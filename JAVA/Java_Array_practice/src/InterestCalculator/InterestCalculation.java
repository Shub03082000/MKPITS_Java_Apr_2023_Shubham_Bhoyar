package InterestCalculator;

public final class InterestCalculation {
    private int rateOfInterest;
    private double Interest;
    private int time;
//    private int principalAmount;

    public InterestCalculation(){
        rateOfInterest = 10;
//        principalAmount = 1000;
//        time = 2;
    }
    public final void CalculateInterest(String accountNumber, int principalAmount, int time){
        Interest = principalAmount*(1+rateOfInterest*time);
        System.out.println("Interest rate is : " + Interest);
    }
}
