public class Hilo extends Thread {
    public Hilo() {

    }

    public void run() {
        System.out.println( Thread.currentThread().getName() );
    }
}
