import java.io.Serializable;

public class PersonaBean implements Serializable {
    private String cedula;
    private String nombre;
    private String apellido;

    // Constructor vacío
    public PersonaBean() {}

    // Constructor con parámetros
    public PersonaBean(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}