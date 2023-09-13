package comparableInterface;

public class Student implements Comparable<Student>{
    private String name;
    private int marks;

    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public Student() {

    }

    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    @Override
    public int compareTo(Student student) {
        if(student.getMarks()==marks){
            return 0;
        } else if (student.getMarks()<marks) {
            return 1;
        }else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
