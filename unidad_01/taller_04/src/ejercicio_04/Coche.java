package ejercicio_04;

public class Coche extends VehiculoBase implements Vehiculo, Automatico {

    public Coche(String modelo, String marca) {
        super(modelo, marca);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void analizarFrenos() {
        System.out.println("Analizando frenos...");   
    }

    @Override
    public void analizarMotor() {
        System.out.println("Analizando motor...");   
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
