package Exception_handling;

public class ExceptionExample {
    public void exampleException(String str) throws StringOutOfBound {
        String substring = str.substring(2,8);
            throw new StringOutOfBound();
    }
}
