package MethodReference_By_Contstructor_Reference;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    public Student() {

    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
