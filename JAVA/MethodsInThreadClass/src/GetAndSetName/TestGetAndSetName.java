package GetAndSetName;

public class TestGetAndSetName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        System.out.println(myThread.getName());
        Thread.currentThread().setName("shubham");
        System.out.println(Thread.currentThread().getName());
//        System.out.println(10/0);
    }
}
