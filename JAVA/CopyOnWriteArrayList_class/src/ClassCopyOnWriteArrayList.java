import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClassCopyOnWriteArrayList extends Thread{
    static CopyOnWriteArrayList arrayList = new CopyOnWriteArrayList<String>();

    @Override
    public void run() {
        arrayList.add("Shubham");
        arrayList.add("Aniket");
        arrayList.add("sanket");
    }

    public static void main(String[] args) {
        arrayList.add("shivam");
        arrayList.add("raj");

        ClassCopyOnWriteArrayList classCopyOnWriteArrayList = new ClassCopyOnWriteArrayList();
        classCopyOnWriteArrayList.start();

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(arrayList);
    }
}
