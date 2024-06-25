import java.util.*;

public class Productor implements Runnable {

    private Canal<Date> cola;

    public Productor(Canal<Date> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        Date mensaje;

        while (true) {
            mensaje = new Date();
            System.out.println("Productor: " + mensaje);
            this.cola.enviar(mensaje);
        }
    }
    
    public Date getMensaje() {
        return null;
    }
}