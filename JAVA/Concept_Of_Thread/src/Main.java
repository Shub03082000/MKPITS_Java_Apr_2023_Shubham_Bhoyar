public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int counter=0; counter<5; counter++){
            System.out.println("Main Thread");
        }
    }
}