public class MyThread extends Thread{
    @Override
    public void run(){
        for(int counter=0; counter<5; counter++){
            System.out.println("Child Thread");
        }
    }
}
