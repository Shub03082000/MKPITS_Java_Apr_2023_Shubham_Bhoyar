public class InsufficientBalance extends Exception{
    @Override
    public String getMessage() {
        return "Insufficient balance";
    }
}
