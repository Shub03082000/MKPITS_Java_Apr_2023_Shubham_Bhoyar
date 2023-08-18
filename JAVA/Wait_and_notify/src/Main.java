import Wait_Notify_method.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ThreadWait t = new ThreadWait();
//        Thread t1 = new Thread(t);
//        t1.start();
//
//        synchronized (t) {
//            try {
//                System.out.println("waiting for thread wait to complete.....");
//                t.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Total is : " + t.total);
//        }


//============================== Actual use  of thread =================================================//
        MyThread myThread = new MyThread();
        myThread.start();
        synchronized (myThread){
            myThread.wait();
        }

        System.out.println("Total is : " + myThread.getTotal());

    }
}