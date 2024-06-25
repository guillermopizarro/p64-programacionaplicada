public class Monitor {

    private int contador = 0;

    synchronized public void incrementar() {
        this.contador++;
    }

    public int getContador() {
        return this.contador;
    }
}
