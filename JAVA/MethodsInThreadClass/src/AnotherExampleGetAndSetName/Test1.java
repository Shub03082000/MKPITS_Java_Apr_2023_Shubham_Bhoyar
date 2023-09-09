package AnotherExampleGetAndSetName;

import AnotherExampleGetAndSetName.MyThread1;

public class Test1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        System.out.println("main method executed by thread : " + Thread.currentThread().getName());
    }
}
