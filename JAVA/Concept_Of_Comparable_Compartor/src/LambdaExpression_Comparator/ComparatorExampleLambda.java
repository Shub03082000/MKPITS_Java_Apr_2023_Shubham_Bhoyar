package LambdaExpression_Comparator;

import ComparatorInterface.Student1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ComparatorExampleLambda {
    public static void main(String[] args) {
        LinkedList<Student1> list = new LinkedList<Student1>();
        list.add(new Student1("sanket",34));
        list.add(new Student1("pranay",23));
        list.add(new Student1("aniket",90));

        System.out.println("--------------------- Sorting on Name -----------------------");
        Collections.sort(list,(s1,s2) ->{
            return s1.getName().compareTo(s2.getName());
        });
        System.out.println(list);

        System.out.println("---------------------- Sorting on marks --------------------------");
        Collections.sort(list,(s1,s2)->{
            if(s1.getMarks()==s2.getMarks())
                return 0;
            else if(s1.getMarks()<s2.getMarks())
                return -1;
            else
                return 1;
        });
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
