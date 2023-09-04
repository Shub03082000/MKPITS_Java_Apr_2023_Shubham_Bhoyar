//child claas which inherit the properties of the parent class
public class Student extends Person{
    //child class instance variable
    private int rollno;
    private int marks;

    //child class constructor which set the value of its own instance variable along with
    //parent variable by accessing it to using super keyword
    public Student(String name, int age, int rollno, int marks){
        super(name,age);
        this.rollno = rollno;
        this.marks = marks;
    }

    //getter method to access the values
    public int getRollno(){
        return rollno;
    }

    public int getMarks(){
        return marks;
    }
}
