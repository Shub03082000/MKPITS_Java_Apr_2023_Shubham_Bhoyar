package Runnable_Interface;

public class YourThread implements Runnable{
    public void run(){
//        System.out.println("Runnable interface");
        while(true){
            System.out.println(Thread.currentThread().getName());

        }
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());

    }
}
