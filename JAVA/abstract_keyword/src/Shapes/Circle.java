import Shapes.Shape;

public class Circle extends Shape {
//    static double pie=3.14;
    private final int radius;

    public Circle(int radius){
        this.radius = radius;
    }

//    public void setRadius(int radius) {
//        this.radius = radius;
//    }

    @Override
    public void calculateArea(){
        System.out.println("Area of Circle : " + (Math.PI*radius*radius));
//        double area;
//        area = pie*radius*radius;
//        return area;
    }

}
