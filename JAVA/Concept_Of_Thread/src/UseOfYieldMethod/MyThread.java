package UseOfYieldMethod;

public class MyThread extends Thread{
    public void run(){
        for(int counter = 0; counter < 5; counter++){
            System.out.println("child thread");
            Thread.yield();
        }
    }
}
