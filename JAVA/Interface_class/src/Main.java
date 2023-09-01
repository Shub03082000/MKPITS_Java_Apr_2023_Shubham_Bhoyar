import Interface_Example.Circle;
import Interface_Example.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(21,2);
        rectangle.calculateArea();//Abstract method of interface, overridden in class on which interfaces is implemented
        rectangle.displayColor();//Overridden default

        Circle circle = new Circle(8);
        circle.calculateArea();

    }
}