package ComparatorInterface;

public class Student1 {
    private String name;
    private int marks;

    public Student1(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public Student1() {

    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
