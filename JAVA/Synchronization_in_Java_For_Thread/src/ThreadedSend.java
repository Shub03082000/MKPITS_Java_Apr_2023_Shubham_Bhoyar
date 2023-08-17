public class ThreadedSend extends Thread{
    private String message;
    Sender sender;

    public ThreadedSend(String m, Sender object) {
        message = m;
        sender = object;
    }

    @Override
    public void run() {
//        synchronized (sender) { //block synchronized
            sender.send(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//        }
    }
}
