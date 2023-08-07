import Inheritance_and_Method_Overriding.JavaExample1;
import Inheritance_by_getter_setter.TeacherClass;
import UsingContstructor.JavaExample;
//import Teacher.PhysicsTeacher;

public class Main {
    public static void main(String[] args) {
//----------------------------- By using normal public access modifier ------------------------------
//        PhysicsTeacher physicsTeacher = new PhysicsTeacher();
//        System.out.println(physicsTeacher.collegeName);
//        System.out.println(physicsTeacher.designation);
//        System.out.println(physicsTeacher.mainSubject);

//        //accessing the method of parent class
//        physicsTeacher.does();

//----------------------------- By using getter setter ---------------------------------------------
        /* Note: we are not accessing the data members
         * directly we are using public getter method
         * to access the private members of parent class
         */
//        TeacherClass teacherClass = new TeacherClass();
//        System.out.println(teacherClass.getCollegeName());
//        System.out.println(teacherClass.getDesignation());
////        System.out.println(teacherClass.subject);
//        teacherClass.doesSetGet();


//----------------------------- By using getter setter ---------------------------------------------
//        JavaExample javaExample = new JavaExample();


//----------------------------- By using getter setter ---------------------------------------------
        JavaExample1 javaExample1 = new JavaExample1();
        javaExample1.display();
    }
}