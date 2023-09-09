package ThreadPriority;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority t = new ThreadPriority();
        t.setPriority(10);
        t.start();
        for(int counter=0; counter<5; counter++){
            System.out.println("Main thread");
        }
    }
}
