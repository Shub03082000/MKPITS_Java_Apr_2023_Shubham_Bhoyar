public class Sender {
    public synchronized void send(String message){ //method synchronized
//        synchronized (this){//class lock (synchronized block)
        System.out.println("Sending message " + message);
        System.out.println("Message Sent " + message);
//        }
    }
}
