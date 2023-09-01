package Even_Odd_number;

public class EvenNumber implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=1000; i++){
            if(i%2 == 0){
                System.out.println("Even : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
