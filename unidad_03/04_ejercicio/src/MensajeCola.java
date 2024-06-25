import java.util.Vector;

public class MensajeCola<E> implements Canal<E> {

    private Vector<E> cola;

    public MensajeCola() {
        this.cola = new Vector<E>();
    }

    @Override   
    public void enviar(E elemento) {
        this.cola.addElement(elemento);
    }

    @Override
    public E recibir() {
        if (this.cola.size() == 0) {
            return null;
        } else {
            return this.cola.remove(0);
        }
    }
    
}
