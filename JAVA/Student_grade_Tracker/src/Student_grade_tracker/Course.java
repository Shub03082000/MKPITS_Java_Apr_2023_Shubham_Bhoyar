package Student_grade_tracker;

public class Course {
    private String courseName;
    private double creditHours;
    private double grade;

    public Course(String courseName, double creditHours) {
        this.courseName = courseName;
        this.creditHours=creditHours;
        this.grade=0.0;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public double getGrade() {
        return grade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", creditHours=" + creditHours +
                ", grade=" + grade +
                '}';
    }
}
