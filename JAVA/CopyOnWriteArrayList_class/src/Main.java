import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main{
    public static void main(String[] args) throws InterruptedException {

//        CopyOnWriteArraylistClass.useOfCopyOnWriteArraylistClass();
        ThreadClass threadClass = new ThreadClass();

        // We create a child thread
        // that is going to modify
        // ArrayList threadClass
        threadClass.copyOnWriteArrayList.add(76);
        threadClass.copyOnWriteArrayList.add(87);
        threadClass.start();
        ThreadClass.sleep(1000);


        // Now we iterate through
        // the ArrayList and get
        // exception.
        Iterator iterator = threadClass.copyOnWriteArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            ThreadClass.sleep(1000);
        }
        System.out.println(threadClass.copyOnWriteArrayList);

    }
}