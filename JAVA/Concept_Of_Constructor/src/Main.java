public class Main {
    public static void main(String[] args) {
        Student student = new Student("shubham",23,101,90);
        System.out.println("Name of the student = "+student.getName());
        System.out.println("Age of the student = " + student.getAge());
        System.out.println("Roll number of the student = " + student.getRollno());
        System.out.println("Marks of the student = " + student.getMarks());
    }
}