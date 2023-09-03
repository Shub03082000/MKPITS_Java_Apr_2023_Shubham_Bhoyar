import Abstract_Practice.Circle;
import Abstract_Practice.Rectangle;
import Abstract_Practice.Square;
import Calculator_abstract_keyword.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//=============================== Area for Rectangle ==========================================//
//        Rectangle rectangle = new Rectangle(12,6);
//        rectangle.calculateArea();

//=============================== Area for Circle ============================================//
//        Circle circle = new Circle(8);
//        circle.calculateArea();

//============================== Area for Square =============================================//
//        Square square = new Square(9);
//        square.calculateArea();


//===================================== Calculator =================================================//
        Calculator calculator;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        System.out.println("Choose you option " + "\n" + "1-Addition" + "\n" + "2-Subtraction" + "\n" + "3-Multiplication" + "\n" + "4-Division" + "\n" + "5-Modulus");
        int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    calculator = new Addition();
                    result = calculator.getCalculate(number1,number2);
                    System.out.println("Addition of number1 and number2 = " + result);
                    break;
                case 2:
                    calculator = new Substraction();
                    result = calculator.getCalculate(number1,number2);
                    System.out.println("Subtraction of number1 and number2 = " + result);
                    break;
                case 3:
                    calculator = new Multiplication();
                    result = calculator.getCalculate(number1,number2);
                    System.out.println("Multiplication of number1 and number2 = " + result);
                    break;
                case 4:
                    calculator = new Division();
                    result = calculator.getCalculate(number1,number2);
                    System.out.println("Division of number1 and number2 = " + result);
                    break;
                case 5:
                    calculator = new Modulus();
                    result = calculator.getCalculate(number1,number2);
                    System.out.println("Modulus of number1 and number2 = " + result);
                    break;
            }

    }
}