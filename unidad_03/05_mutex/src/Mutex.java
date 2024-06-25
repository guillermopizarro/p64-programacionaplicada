public class Mutex {
    private boolean recursoDisponible;

    public Mutex() {
        this.recursoDisponible = true;
    }

    synchronized public void bloquear() {
        while(!this.recursoDisponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.recursoDisponible = false;
    }

    synchronized public void desbloquear() {
        this.recursoDisponible = true;
        notifyAll();
    }
}
