package LamdaExpressionExample;

public class MainArea {
    public static void main(String[] args) {
        Shape shape = (length, breadth) -> {
            System.out.println("Area of rectangle = " + (length*breadth));
        };
        shape.calculateArea(12,2);
    }
}
