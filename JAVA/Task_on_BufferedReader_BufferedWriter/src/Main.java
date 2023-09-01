import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Shubham",89);
        try {
            FileOutputStream f = new FileOutputStream(new File("program.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(student);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("program.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Student s1 = (Student) oi.readObject();
            System.out.println(s1.toString());

            oi.close();
            fi.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}