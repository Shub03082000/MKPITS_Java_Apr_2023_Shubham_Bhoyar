package JoinAndSleepMethodExample;

public class ThreadJoinSleepDemo {
    public static void main(String[] args) throws InterruptedException{
        MyThread4.mt=Thread.currentThread();
        MyThread4 myThread4 = new MyThread4();
        myThread4.start();
        for(int counter=0; counter<5; counter++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
