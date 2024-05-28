package ejercicio_02;

public class App {
    public static void main(String[] args) {
        Coche obj = new Coche("Corolla", "Toyota");
        obj.encender();
        obj.acelerar();
        obj.frenar();

        // No se puede definir un objeto a partir de una clase abstracta.
        // Vehiculo obj2 = new Vehiculo("Sportage", "KIA");
    }
}