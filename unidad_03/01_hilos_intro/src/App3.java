public class App3 {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            Thread hilo = new Thread( new Runnable() {
                public void run() {
                    System.out.println( Thread.currentThread().getName() );
                }
            } );
            hilo.start();
        }
    }
}
