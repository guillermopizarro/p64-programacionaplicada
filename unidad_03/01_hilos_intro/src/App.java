public class App {
    public static void main(String[] args) throws Exception {
        Hilo hilo = new Hilo();
        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();

        hilo.start();
        hilo1.start();
        hilo2.start();
    }
}
