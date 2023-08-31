import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIterator {
    public void useOfIteratorListIterator(){
        List list = new LinkedList<Integer>();
        list.add(25);
        list.add(35);
        list.add(15);
        list.add(40);
        list.add(36);
        list.add(55);

        //Using Iterator
        Iterator iterator = list.iterator();
        System.out.println("============================ Iterator ====================================");
        System.out.println("------------ Forward Transversal:- ---------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Using ListIterator
        ListIterator listIterator = list.listIterator();

        System.out.println("============================ ListIterator ====================================");
        System.out.println("--------------- Forward Transversal:- ---------------");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("----------------- Backward Transversal -----------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
