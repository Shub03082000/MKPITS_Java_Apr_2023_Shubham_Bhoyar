package AnotherExampleGetAndSetName;

import java.awt.*;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("run method executed by thread : " + Thread.currentThread().getName());
    }
}
