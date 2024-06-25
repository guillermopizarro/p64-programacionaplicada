import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Mutex mutex = new Mutex();

        List<HiloMutex> hilos = new ArrayList<HiloMutex>();

        for (int i=1; i<=10000; i++) {
            HiloMutex hilo = new HiloMutex(mutex);  
            hilos.add(hilo);
            hilo.start();
        }

        for (HiloMutex hilo: hilos) {
            hilo.join();
        }
        System.out.println(HiloMutex.getContador());
    }
}
