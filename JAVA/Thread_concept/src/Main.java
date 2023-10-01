import Even_Odd_number.EvenNumber;
import Even_Odd_number.OddNumber;
import Generate_Random_number.GenerateRandom;
import Pachage1.MyThread;
import Runnable_Interface.YourThread;
import ThreadName.ThreadName;


public class Main {
    public static void main(String[] args) throws InterruptedException { //main also one of thread
        //================================ Thread class ==========================================//
        //main thread has maximum priority
//        System.out.println("hi");
//        MyThread thread = new MyThread("sanket");

//        thread.setName("shubham");//set name of thread i have created(change main thread name)
//        Thread.currentThread().setName("bhoyar");//set name of main thread(change thread name)
//        thread.start();
//        System.out.println("bye");
//        System.out.println(Thread.currentThread().getPriority());//priority of main thread
//        System.out.println(thread.getPriority());//printing priority of thread i have created
//        System.out.println(thread.getName());//printing name of thread i have created
//        System.out.println(Thread.currentThread().getName());//printing name of main thread


        //================================== Runnable Interface =====================================//
        //During multiple thread both thread run simultaneously
//        Thread thread1 = new Thread(new YourThread(),"shubham bhoyar");
//        Thread thread2 = new Thread(new YourThread(),"pratham");
//        thread1.setPriority(6);//this is the way to set priority of runnable thread
//        thread2.start();
//        thread1.start();
//        System.out.println(Thread.activeCount());
//        System.out.println(thread1.getId());
//        System.out.println(thread1.isAlive());


// ============================================= Even number program ==========================================//
//        Thread t1 = new Thread(new EvenNumber());
//        Thread t2 = new Thread(new OddNumber());
//        t1.start();
//        t2.start();


//============================================ Generate random number =========================================//
//        Thread t = new Thread(new GenerateRandom());
//        t.start();


//========================================== Print Thread Name (use of Join method) ================================================//
        //Both threads work simultaneously
        ThreadName threadName1 = new ThreadName();
        ThreadName threadName2 = new ThreadName();
        threadName2.start();
        threadName2.join();//join() method is kind of synchronization (means second task is not executes until first task complete)
        threadName1.start();

    }
}