package OverridingStartMethod;

public class MainStart {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("main method");
    }
}
