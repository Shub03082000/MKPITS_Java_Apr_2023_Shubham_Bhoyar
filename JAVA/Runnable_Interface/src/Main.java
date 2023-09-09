public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        for(int counter=0; counter<5; counter++){
            System.out.println("Main thread");
        }
    }
}