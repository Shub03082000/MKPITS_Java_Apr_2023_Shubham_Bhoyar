public class InvalidAmount extends Exception{
    @Override
    public String toString() {
//        return super.toString();
        return "Insufficient balance";
    }
}

