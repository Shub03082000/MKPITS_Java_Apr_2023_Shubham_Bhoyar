package Abstract_Practice;

public class Rectangle extends ShapeClass{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public void calculateArea(){
        double areaOfRectangle = length*breadth;
        System.out.println("Area of Rectangle = " + areaOfRectangle);
    }
}
