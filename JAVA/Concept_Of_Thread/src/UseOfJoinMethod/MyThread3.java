package UseOfJoinMethod;

public class MyThread3 extends Thread{
    @Override
    public void run() {
        for(int counter=0; counter<5; counter++){
            System.out.println("Seetha thread");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
