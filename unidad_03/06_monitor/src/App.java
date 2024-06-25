import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Monitor monitor = new Monitor();

        List<HiloMonitor> hilos = new ArrayList<HiloMonitor>();

        for (int i=1; i<=10000; i++) {
            HiloMonitor hilo = new HiloMonitor(monitor);  
            hilos.add(hilo);
            hilo.start();
        }

        for (HiloMonitor hilo: hilos) {
            hilo.join();
        }
        System.out.println(monitor.getContador());
    }
}
