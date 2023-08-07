package Inheritance_and_Method_Overriding;

import UsingContstructor.JavaExample;

public class JavaExample1 extends ParentClass1{
    public JavaExample1(){
        System.out.println("Constructor of child class");
    }
    @Override
    public void display(){
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.display();
    }
}
