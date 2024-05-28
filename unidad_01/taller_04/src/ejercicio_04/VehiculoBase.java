package ejercicio_04;

public abstract class VehiculoBase {
    
    private String modelo;
    private String marca;

    public VehiculoBase(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El vehiculo se encuentra encendido.");
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}