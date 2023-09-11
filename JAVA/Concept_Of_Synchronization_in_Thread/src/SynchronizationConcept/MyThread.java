package SynchronizationConcept;

public class MyThread extends Thread{
    private Display d;
    private String name;

    public MyThread(Display d,  String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
