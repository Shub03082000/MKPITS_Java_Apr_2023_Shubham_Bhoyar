package Shape;

public class Rectangle implements Shape{
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        double rectangleArea = length * breadth;
        return rectangleArea;
    }
}
