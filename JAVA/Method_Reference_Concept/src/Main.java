import MethodReference_By_Contstructor_Reference.Student;
import MethodReference_By_Contstructor_Reference.YourInterface;
import MethodReference_By_InBuildInterface.MyClass;
import MethodReference_By_UserDefinedInterface.MyInterface;
import MethodReference_By_UserDefinedInterface.MyMethodReference;

public class Main {
    public static void main(String[] args) {
//------------------ Method reference by using In build interface ------------------------------------------/
//        Runnable runnable = MyClass::displayEvenNumber;
//        Thread thread = new Thread(runnable);
//        thread.start();

//------------------- Method reference by using user defined interface to giving reference of non-static method ---------------------/
        System.out.println("---------------- Giving reference of non-static method in method reference ------------------------");
        MyMethodReference myMethodReference = new MyMethodReference();
        MyInterface myInterface = myMethodReference::displayOdd;
        myInterface.displayOddNumber();

//------------------- Method reference by giving Constructor reference ------------------------------------//
        System.out.println("--------------- Method reference by giving Constructor reference ---------------");
        YourInterface yourInterface = Student::new;
        Student student = yourInterface.getStudent("Shubham",90);
        System.out.println("student name = "+student.getName());
        System.out.println("student marks = "+student.getMarks());
    }
}