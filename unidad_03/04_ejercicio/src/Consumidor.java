import java.nio.channels.Channel;
import java.util.*;

public class Consumidor implements Runnable {

    private Canal<Date> cola;

    public Consumidor(Canal<Date> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        Date mensaje;

        while(true) {
            mensaje = this.cola.recibir();

            if (mensaje != null) {
                System.out.println("Mensaje recibido: " + mensaje);
            }
        }
    }
}
