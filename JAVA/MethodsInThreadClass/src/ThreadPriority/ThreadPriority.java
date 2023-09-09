package ThreadPriority;

public class ThreadPriority extends Thread{
    @Override
    public void run() {
        for(int counter=0; counter<5; counter++){
            System.out.println("child thread");
        }
    }
}
