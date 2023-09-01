import Calculator.Addition;
import Calculator.Division;
import Calculator.Multiplication;
import Calculator.Subtraction;
import Shape.Circle;
import Shape.Rectangle;

import java.awt.image.CropImageFilter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//============================ Calculate Area of Circle ===========================================
//        System.out.println("Enter radius of circle : ");
//        int radius = scanner.nextInt();
//        Circle c = new Circle();
//        c.setRadius(radius);
//        double areaOfCircle = c.calculateArea();
//        System.out.println("Area of Circle is : " + areaOfCircle);

//============================ Calculate Area of Rectangle ==========================================
//        System.out.println("Enter length of rectangle : ");
//        int length = scanner.nextInt();
//        int breadth = scanner.nextInt();
//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(length);
//        rectangle.setBreadth(breadth);
//        System.out.println("Area of Rectangle is : " + rectangle.calculateArea());


//============================= Calculator ====================================================
        System.out.println("Enter number1 and number2 : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Addition of two number is : " + addition.Calculator(number1,number2));
        System.out.println("Subtraction of two number is : " + subtraction.Calculator(number1,number2));
        System.out.println("Multiplication of two number is : " + multiplication.Calculator(number1,number2));
        System.out.println("Division of two number is : " + division.Calculator(number1,number2));

    }
}