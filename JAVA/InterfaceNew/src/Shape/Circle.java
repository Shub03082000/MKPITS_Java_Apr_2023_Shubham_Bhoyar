package Shape;

public class Circle implements Shape{
    final static double pie = 3.14;
    private int radius;
    private double calculateCircleArea;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double calculateCircleArea = pie * radius * radius;
        return calculateCircleArea ;
    }
}
