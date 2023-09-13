import ComparatorInterface.MarksComparator;
import ComparatorInterface.NameComparator;
import comparableInterface.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("shubham",56));
        arrayList.add(new Student("pranay",90));
        arrayList.add(new Student("abhi",30));
//        Collections.sort(arrayList);
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Collections.sort(arrayList,new NameComparator());
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collections.sort(arrayList,new MarksComparator());
        System.out.println(arrayList);
    }
}