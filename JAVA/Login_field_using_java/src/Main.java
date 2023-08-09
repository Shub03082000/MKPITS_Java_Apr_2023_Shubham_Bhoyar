import OctalBinaryHexConversion.OctalBinaryHexConversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//================================== Check Password ===================================================================
//        System.out.println("Enter password : ");
//        String str1 = scanner.next();
//        System.out.println("Confirm password : ");
//        String str2 = scanner.next();
//        PasswordProgram passwordProgram = new PasswordProgram();
//        passwordProgram.checkPassword(str1,str2);


//=============================== Number conversion to Octal, Binary, Hexadecimal =====================================
        System.out.println("Enter random number here : ");
        int number = scanner.nextInt();
        OctalBinaryHexConversion octalBinaryHexConversion = new OctalBinaryHexConversion();
        octalBinaryHexConversion.octalBinaryHexFindOut(number);
    }
}