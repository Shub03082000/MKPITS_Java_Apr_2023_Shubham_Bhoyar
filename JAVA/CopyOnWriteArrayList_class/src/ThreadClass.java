import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadClass extends Thread {
    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>();
    @Override
    public void run() {
        // Child thread trying to
        // add new element in the
        // Collection object
        copyOnWriteArrayList.add(23);
        copyOnWriteArrayList.add(45);
    }
}
