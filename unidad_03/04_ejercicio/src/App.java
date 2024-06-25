import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Canal<Date> cola = new MensajeCola<Date>();

        Thread productor = new Thread( new Productor(cola) );
        Thread consumidor = new Thread( new Consumidor(cola) );

        productor.start();
        consumidor.start();
    }
}
