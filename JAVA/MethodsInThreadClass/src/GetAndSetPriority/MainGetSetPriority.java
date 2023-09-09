package GetAndSetPriority;

public class MainGetSetPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("Priority of main thread : " + Thread.currentThread().getPriority());
        GetAndSetPriority t = new GetAndSetPriority();
        //priority of child thread inherited from parent thread
        System.out.println("Priority of child thread : "+ t.getPriority());

    }
}
