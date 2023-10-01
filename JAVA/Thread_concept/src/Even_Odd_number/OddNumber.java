package Even_Odd_number;

public class OddNumber implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            if(i%2 != 0){
                System.out.println("Odd : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
