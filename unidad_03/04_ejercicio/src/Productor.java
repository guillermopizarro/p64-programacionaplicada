import java.util.*;

public class Productor implements Runnable {

    private Channel<Date> cola;

    public Productor(Channel<Date> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        Date mensaje;

        while (true) {
            mensaje = new Date();
            System.out.println("Productor: " + mensaje);
            this.cola.send(mensaje);
        }
    }
    
    public Date getMensaje() {
        return null;
    }
}