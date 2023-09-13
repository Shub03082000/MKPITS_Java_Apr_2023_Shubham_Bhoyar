import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizedArrayList {
    public static void useOfSynchronizedInArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(65);
        synchronized (arrayList) {
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
