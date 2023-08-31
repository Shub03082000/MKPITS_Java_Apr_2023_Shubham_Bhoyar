import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorClass {
    public static void useOfListIterator(){
        List<Integer> arrayList = new ArrayList();
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(85);
        arrayList.add(90);
        arrayList.add(100);
        arrayList.add(199);
        ListIterator listIterator = arrayList.listIterator();

        System.out.println("============================ hasNext ================================");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("============================ hasPrevious ============================");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

//========================================= Using LinkList =========================================//
        System.out.println("========================================= Using LinkList =========================================");
        LinkedList list = new LinkedList();
        list.add("shubham");
        list.add("aniket");
        list.add("sanket");
        list.add("shivam");
        list.add("mohit");

        ListIterator listIterator1 = list.listIterator();
        System.out.println("======================= hasNext ============================");
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }
        while (listIterator1.hasNext()){
            System.out.println(listIterator1.next());
        }

        System.out.println("======================= hasPrevious ==========================");
        while (listIterator1.hasPrevious()){
            System.out.println(listIterator1.previous());
        }
    }
}
