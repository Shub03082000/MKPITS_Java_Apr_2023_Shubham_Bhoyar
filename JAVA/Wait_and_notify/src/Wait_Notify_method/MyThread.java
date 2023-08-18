package Wait_Notify_method;

public class MyThread extends Thread{
    int total;

    public int getTotal() {
        return total;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            total += i;
        }
    }
}
