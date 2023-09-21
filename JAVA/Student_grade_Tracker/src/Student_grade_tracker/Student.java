package Student_grade_tracker;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public double calculateGPA(){
        double totalCredits = 0.0;
        double totalWeightedGPA = 0.0;

        for(Course course : courses){
            totalCredits += course.getCreditHours();
            totalWeightedGPA += course.getGrade() * course.getCreditHours();
        }

        if(totalCredits == 0) return 0.0;

        return totalWeightedGPA / totalCredits;
    }

}
