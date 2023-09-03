import Abstract_Practice.Circle;
import Abstract_Practice.Rectangle;
import Abstract_Practice.Square;


public class Main {
    public static void main(String[] args) {
//=============================== Area for Rectangle ==========================================//
        Rectangle rectangle = new Rectangle(12,6);
        rectangle.calculateArea();

//=============================== Area for Circle ============================================//
        Circle circle = new Circle(8);
        circle.calculateArea();

//============================== Area for Square =============================================//
        Square square = new Square(9);
        square.calculateArea();
    }
}