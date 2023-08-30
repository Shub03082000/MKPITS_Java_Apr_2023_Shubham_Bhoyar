package UseOfComparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class UseComparatorInterface {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        StudentClass[] studentClasses = new StudentClass[4];

        studentClasses[0] = new StudentClass("Pranay",90);
        studentClasses[1] = new StudentClass("Shubham",85);
        studentClasses[2] = new StudentClass("Abhi",95);
        studentClasses[3] = new StudentClass("mohit",65);

        System.out.println("================================ Sort By Name =========================================");
        linkedList.addAll(Arrays.asList(studentClasses));
        Collections.sort(linkedList, new SortByName());
        for(Object studentClass : linkedList){
            System.out.println(studentClass);
        }

        System.out.println("================================ Sort By Marks ========================================");
        Collections.sort(linkedList,new SortByMarks());
        for(Object stuentClass : linkedList){
            System.out.println(stuentClass);
        }
    }
}
