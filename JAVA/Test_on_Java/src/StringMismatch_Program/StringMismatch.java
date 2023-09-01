package StringMismatch_Program;

public class StringMismatch extends Exception{
    @Override
    public String getMessage() {
        return "Strings are not match";
    }
}
