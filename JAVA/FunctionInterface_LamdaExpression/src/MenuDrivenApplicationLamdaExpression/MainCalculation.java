package MenuDrivenApplicationLamdaExpression;

import java.util.Scanner;

public class MainCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter your Choice" + "\n 1-Addition \n 2-Subtraction \n 3-Multiplication \n 4-Division");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Calculation calculation = (number1,number2) ->{
                    System.out.println("Addition of number = " + (number1+number2));
                };
                calculation.calculate(num1,num2);
                break;
            case 2:
                Calculation calculation1 = (number1,number2) ->{
                    System.out.println("Subtraction of number = " + (number1-number2));
                };
                calculation1.calculate(num1,num2);
                break;
            case 3:
                Calculation calculation2 = (number1,number2) ->{
                    System.out.println(("Multiplication of number = " + (number1*number2)));
                };
                calculation2.calculate(num1,num2);
                break;
            case 4:
                Calculation calculation3 = (number1,number2) ->{
                    System.out.println("Division of number = " + (number1/number2));
                };
                calculation3.calculate(num1,num2);
                break;
        }

    }
}
