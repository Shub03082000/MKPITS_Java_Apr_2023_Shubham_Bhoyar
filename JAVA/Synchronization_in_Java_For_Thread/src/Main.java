public class Main {
    public static void main(String[] args) {
        Sender obj = new Sender();
        ThreadedSend threadedSend1 = new ThreadedSend("hi",obj);
        ThreadedSend threadedSend2 = new ThreadedSend("Bye",obj);
        threadedSend1.start();
        threadedSend2.start();
    }
}