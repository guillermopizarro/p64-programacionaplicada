public class App4 {
    public static void main(String[] args) {
        Tarea tarea = new Tarea();

        for (int i=1; i<=10; i++) {
            Thread hilo = new Thread(tarea);
            hilo.start();
        }
    }
}
