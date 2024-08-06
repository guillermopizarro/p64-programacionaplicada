import java.util.List;

public class App {
    public static void main(String[] args) {
        PersonaBeanDAO personaDAO = new PersonaBeanDAO();

        // Insertar una nueva persona
        PersonaBean persona = new PersonaBean("1234567123", "Luis", "Alvarez");
        personaDAO.insertarPersona(persona);

        // Obtener y mostrar las personas
        List<PersonaBean> personas = personaDAO.obtenerPersonas();
        for (PersonaBean p : personas) {
            System.out.println("Cedula: " + p.getCedula() + ", Nombre: " + p.getNombre() + ", Apellido: " + p.getApellido());
        }
    }
}