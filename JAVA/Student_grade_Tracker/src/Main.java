import Student_grade_tracker.Course;
import Student_grade_tracker.Student;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        System.out.println("Enter number of courses: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine();

        for(int counter = 0; counter < numberOfCourses; counter++){
            System.out.println("Enter course name for course " + (counter + 1) + ": ");
            String courseName = scanner.nextLine();

            System.out.println("Enter credits for course " + (counter + 1) + ": ");
            int credits = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter grade (0.0 - 4.0) for course " + (counter + 1) + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            Course course = new Course(courseName,credits);
            course.setGrade(grade);

            student.addCourse(course);
        }

        //Calculate GPA
        double gpa = student.calculateGPA();
        System.out.println("Student GPA : " + gpa);

    }
}