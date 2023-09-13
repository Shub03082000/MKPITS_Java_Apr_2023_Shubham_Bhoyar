package ComparatorInterface;

import comparableInterface.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Student> arrayList1 = new ArrayList<>();
        arrayList1.add(new Student("shubham",56));
        arrayList1.add(new Student("pranay",90));
        arrayList1.add(new Student("abhi",30));
        System.out.println("---------- Sorting on marks ----------------");
        Collections.sort(arrayList1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getMarks()==o2.getMarks())
                    return 0;
                else if (o1.getMarks()<o2.getMarks()) {
                    return -1;
                }else
                    return 1;
            }
        });
        Iterator iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--------------- Sorting on Name ----------------");
        Collections.sort(arrayList1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Iterator iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
