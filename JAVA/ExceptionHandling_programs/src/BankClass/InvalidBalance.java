package BankClass;

public class InvalidBalance extends Exception{
    @Override
    public String getMessage() {
        return "Invalid balance";
    }
}
