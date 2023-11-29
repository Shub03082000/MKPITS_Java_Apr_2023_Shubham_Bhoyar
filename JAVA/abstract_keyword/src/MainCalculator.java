import Calculator.*;
import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //We can not create abstract class object/instantiated
        //we can use the concept of upcasting and downcasting
        //"c" is the reference for superclass

        Calculation c;
        int result;

        System.out.println("Enter first number : ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        int number2 = scanner.nextInt();

        System.out.println("Enter any option here : \n 1-Addition, \n 2-Subtraction, \n 3-Multiplication, \n 4-Division : ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                c = new Addition();
                result = c.getcalculate(number1,number2);
                System.out.println("The Addition of two number is : " + result);
                break;
            case 2:
                c = new Subtraction();
                result = c.getcalculate(number1,number2);
                System.out.println("The Subtraction of two number is : " + result);
                break;
            case 3:
                c = new Multiplication();
                result = c.getcalculate(number1,number2);
                System.out.println("The Multiplication of two number is : " + result);
                break;
            case 4:
                c = new Division();
                result = c.getcalculate(number1,number2);
                System.out.println("The Division of two number is : " + result);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
