package UseOfComparatorInterface;

import ComparatorInterface.StudentComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class UseOfComparatorInterface {
    public static void main(){
        LinkedList linkedList = new LinkedList();
        StudentClass[] studentClasses = new StudentClass[4];

        studentClasses[0] = new StudentClass("Shivam",90);
        studentClasses[1] = new StudentClass("Aniket",85);
        studentClasses[2] = new StudentClass("pranay",95);
        studentClasses[3] = new StudentClass("mohit",65);

        linkedList.addAll(Arrays.asList(studentClasses));
        System.out.println("============================ Sort By Name ====================================");
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
