package Abstract_Practice;

public class Square extends ShapeClass{
    private int side;

    public Square(int side){
        this.side = side;
    }
    @Override
    public void calculateArea(){
        double areaOfSquare = side*side;
        System.out.println("Area of square = " + areaOfSquare);
    }
}
