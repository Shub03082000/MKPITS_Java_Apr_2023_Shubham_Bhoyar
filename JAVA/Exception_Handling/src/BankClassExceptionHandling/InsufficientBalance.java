package Bank;

public class InsufficientBalance extends Exception{
    public String getMessage(){
        return "Insufficient balance";
    }
}
