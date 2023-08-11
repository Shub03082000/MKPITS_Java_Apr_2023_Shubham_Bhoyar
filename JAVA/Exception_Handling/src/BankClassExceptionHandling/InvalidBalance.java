package Bank;

public class InvalidBalance extends Exception{
    public String getMessage(){
        return "Invalid balance";
    }
}
