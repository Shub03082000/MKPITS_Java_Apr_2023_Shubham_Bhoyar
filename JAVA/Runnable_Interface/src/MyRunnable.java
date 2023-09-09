public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int counter=0; counter<5; counter++){
            System.out.println("child thread");
        }
    }
}
