public class ThreadWait implements Runnable{
    int total;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}
