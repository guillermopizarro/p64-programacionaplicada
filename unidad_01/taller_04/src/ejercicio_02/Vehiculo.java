package ejercicio_02;

public abstract class Vehiculo {
    private String modelo;
    private String marca;

    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El vehiculo se encuentra encendido.");
    }

    public abstract void acelerar();
    public abstract void frenar();

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
