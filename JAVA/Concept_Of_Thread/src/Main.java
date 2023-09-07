public class Main {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        for(int counter=0; counter<5; counter++){
            System.out.println("Main Thread");
        }
    }
}