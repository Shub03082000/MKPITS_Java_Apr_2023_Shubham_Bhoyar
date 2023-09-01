import Exception_handling.ExceptionExample;
import Exception_handling.StringOutOfBound;
import StringMismatch_Program.StringClass;
import StringMismatch_Program.StringMismatch;
import NumberFormatException.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StringMismatch {
        Scanner scanner = new Scanner(System.in);
//============================= String Index Out of Bound Exception program =========================================//

        ExceptionExample exceptionExample = new ExceptionExample();
        try{
            System.out.println("Enter string value here : ");
            exceptionExample.exampleException(scanner.next());
        }catch (StringOutOfBound e){
            System.out.println(e);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }


//================================== Number format exception ========================================================//
        StringClassForNumberException stringClassForNumberException = new StringClassForNumberException();
        System.out.println("Enter string value here : ");
        try {
            stringClassForNumberException.numberException(scanner.next());
        }catch (NumberFormatException exception){
            System.out.println(exception);
        }



//==================================== String Mismatch =============================================================//

        StringClass stringClass = new StringClass();
        System.out.println("Enter two string value both should be different : ");
        String str1 = scanner.next();
        String str2 = scanner.next();
        try {
            stringClass.stringMismatch(str1,str2);
        }catch (StringMismatch e){
            System.out.println(e);
        }
    }
}