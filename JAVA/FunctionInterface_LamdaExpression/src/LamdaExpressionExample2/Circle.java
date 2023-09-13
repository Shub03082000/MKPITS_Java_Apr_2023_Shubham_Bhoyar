package LamdaExpressionExample2;

class Circle{
    public Circle(){
        Shape1 shape1 = (int r) -> {
            System.out.println("Area of Circle = " + (Math.PI*r*r));
        };
        shape1.calculateArea(6);
    }
}
