package Generate_Random_number;

public class GenerateRandom implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<20; i++){
            System.out.println(Math.floor(Math.random()*60));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
