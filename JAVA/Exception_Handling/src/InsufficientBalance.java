public class InsufficientBalance extends Exception{
    @Override
    public String getMessage() {
        return "add upto 100 rupees only";
    }
}
