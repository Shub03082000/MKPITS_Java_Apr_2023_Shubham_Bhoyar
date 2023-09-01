package StringBuilder;

public class StringBuilderClass {
    private String str1 = "StringBuilder";
    public void useOfStringBuilder(String str){
        StringBuilder sb2 = new StringBuilder("Welcome to java course");
        System.out.println("setCharAt(int index, char ch) method - The character at the specified index is set to ch : " + sb2.setCharAt(4,'t'));
    }
}
