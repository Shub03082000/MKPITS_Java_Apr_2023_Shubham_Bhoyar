public class Student implements Cloneable{
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }


    public Object clone() throws CloneNotSupportedException{
        return (Student) super.clone();
    }
}


