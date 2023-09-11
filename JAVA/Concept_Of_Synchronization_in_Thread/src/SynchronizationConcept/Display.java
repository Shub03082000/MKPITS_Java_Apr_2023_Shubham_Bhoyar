package SynchronizationConcept;

public class Display {
    public synchronized void wish(String name){
        for(int counter=0; counter<5; counter++) {
            System.out.print("Good morning : ");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(name);
        }
    }
}
