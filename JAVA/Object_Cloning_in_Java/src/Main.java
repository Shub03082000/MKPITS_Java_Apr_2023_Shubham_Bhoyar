public class Main {
    public static void main(String[] args) {
//================================= For Student class ============================================//
//        Student student = new Student("shubham",90);
//        try {
//            Student student1 = (Student) student.clone();
//            System.out.println("student name = "+student1.getName());
//            System.out.println("student marks = "+student1.getMarks());
//
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//================================= For DogName Class ==============================================//
        DogName name = new DogName("Tommy");

        try {
            DogName name2 = (DogName) name.clone();
            System.out.println("Name of Dog = " + name2.getDogName());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}