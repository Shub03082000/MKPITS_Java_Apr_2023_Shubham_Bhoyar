package JoinAndSleepMethodExample;

public class MyThread4 extends Thread{
    static Thread mt;
    @Override
    public void run(){
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int counter=0; counter<5; counter++){
            System.out.println("child Thread");
        }
    }
}
