package WriteObjectToFile;

import java.io.*;

public class FileReadWrite {
    public static void writeObjectToFile(Student student1) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("shubham.txt"));
            objectOutputStream.writeObject(student1);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void readObjectFromFile1(Student student1) {
//        try {
//            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("shubham.txt"));
//            objectInputStream.readObject();
//            System.out.println("Student name : " + student1.getName() + "\n" + "student marks : " + student1.getMarks());
//            objectInputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

//    public static Student readObjectFromFile(Student student1) {
//        try {
//            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("shubham.txt"));
//            objectInputStream.readObject();
//            objectInputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return student1;
//    }
}
