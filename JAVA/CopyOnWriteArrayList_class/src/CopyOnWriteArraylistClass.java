import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylistClass {
    public static void useOfCopyOnWriteArraylistClass(){
        List list = new ArrayList<Integer>();
        list.add(79);
        list.add(87);
        list.add(98);
        list.add(100);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        copyOnWriteArrayList.add(120);
        copyOnWriteArrayList.add(125);
        Iterator iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
