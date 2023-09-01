package Exception_handling;

public class StringOutOfBound extends Exception{
    @Override
    public String getMessage() {
        return "String index out of bound exception";
    }
}
