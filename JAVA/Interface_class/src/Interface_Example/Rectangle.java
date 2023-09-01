package Interface_Example;

public class Rectangle implements Shape {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println(length*breadth);
    }

    @Override
    public void displayColor() {
        Shape.super.displayColor();//Calling default method of interface
        System.out.println("green");
    }
}
