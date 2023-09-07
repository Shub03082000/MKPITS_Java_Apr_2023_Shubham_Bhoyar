package UseOfJoinMethod;

import OverridingStartMethod.MyThread;

import java.nio.channels.MulticastChannel;

public class ThreadJoinDemo{
    public static void main(String[] args) throws InterruptedException{
        MyThread3 myThread3 = new MyThread3();
        myThread3.start();
//        myThread3.join();
        myThread3.join(5000);
        for(int counter=0; counter<5; counter++){
            System.out.println("Rama thread");
        }
    }
}
