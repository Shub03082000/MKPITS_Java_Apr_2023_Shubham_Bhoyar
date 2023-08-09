import CheckWebsite.CheckWebsite;
import StringBufferClass.StringBufferClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scanner.next();
         StringBufferClass stringBufferClass = new StringBufferClass();
         stringBufferClass.useOfStringBuffer(str);


//==================================== Website valid or not ==============================================================
//        CheckWebsite checkWebsite = new CheckWebsite();
//        checkWebsite.findWebsite(str);
    }
}