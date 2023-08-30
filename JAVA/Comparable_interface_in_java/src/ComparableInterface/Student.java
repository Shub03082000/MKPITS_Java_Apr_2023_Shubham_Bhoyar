import java.util.Comparator;

public class Student implements Comparator<Student> {
    String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

//    public String getName() {
//        return name;
//    }
//
//    public int getMarks() {
//        return marks;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

//    @Override
//    public int compareTo(Student o) {
//        if (marks==o.marks)
//            return 0;
//        else if (marks<o.marks)
//            return -1;
//        else
//            return 1;
//
//    }

}
