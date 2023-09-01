package Interface_Example;

public interface Shape {
    String color = "yellow";
    double PI = 3.14;
    void calculateArea();

    //Overriding default method of interface
    default void displayColor(){
//        color = "pink";
        System.out.println(color);
    }

    static void displayName(){
        System.out.println("shubham");
    }

}
