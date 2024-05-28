package ejercicio_03;

public class Coche extends VehiculoBase {

    public Coche(String modelo, String marca) {
        super(modelo, marca);
        //TODO Auto-generated constructor stub
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
