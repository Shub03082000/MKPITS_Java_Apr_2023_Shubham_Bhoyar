package StringMismatch_Program;

public class StringClass {
    public void stringMismatch(String str1, String str2) throws StringMismatch{

        if(str1.equals(str2))
            System.out.println("Strings are match");
        else
            throw new StringMismatch();
    }
}
