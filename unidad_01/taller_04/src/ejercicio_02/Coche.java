package ejercicio_02;

public class Coche extends Vehiculo {

    public Coche(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }
}
