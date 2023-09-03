package Abstract_Practice;

public class Circle extends ShapeClass{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double areaOfCircle = PI*radius*radius;
        System.out.println("Area of Circle = " + areaOfCircle);
    }
}
