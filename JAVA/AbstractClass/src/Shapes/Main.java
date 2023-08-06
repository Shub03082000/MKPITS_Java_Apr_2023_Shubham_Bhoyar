import Shapes.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter radius of circle here ");
//        int radius=scanner.nextInt();
//        Circle circle=new Circle();
//        circle.setRadius(radius);
//        double area= circle.calculateArea();
//        System.out.println("The area Circle is " + area);

        Shape s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1-Circle, 2-Rectangle : ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                int r = scanner.nextInt();
                s=new Circle(r);
                s.calculateArea();
                break;
            case 2:
                int l = scanner.nextInt();
                int b = scanner.nextInt();
                s=new Rectangle(l,b);
                s.calculateArea();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}