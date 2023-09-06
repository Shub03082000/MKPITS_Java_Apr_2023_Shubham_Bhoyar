package OverridingStartMethod;

public class MyThread extends Thread{
    public void start(){
        System.out.println("Start method");
    }
    public void run(){
        System.out.println("Run method");
    }
}
