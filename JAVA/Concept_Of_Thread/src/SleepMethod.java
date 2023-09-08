public class SleepMethod {
    public static void main(String[] args) throws InterruptedException{
        for(int counter=1; counter<=10; counter++){
            System.out.println("Slide - " + counter);
            Thread.sleep(3000);
        }
    }
}
