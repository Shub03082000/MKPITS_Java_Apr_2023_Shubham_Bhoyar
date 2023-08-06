import Shapes.Shape;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setBreadth(double breadth) {
//        this.breadth = breadth;
//    }

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle : " + (length * breadth));
    }
}
