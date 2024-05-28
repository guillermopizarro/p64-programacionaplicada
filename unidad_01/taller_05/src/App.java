import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Jose", 20);
        Persona p2 = new Persona("Maria", 20);
        Persona p3 = new Persona("Julian", 30);
        Persona p4 = new Persona("Karina", 25);
        Persona p5 = new Persona("Sofia", 27);

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        //Persona obj = new Persona("Magdalena", 40);
        //Persona obj = new Persona("Sofia", 27);
        Persona obj = p5;
        for (Persona persona: lista) {
            if (persona.equals(obj)) {
                System.out.println("Existe en la lista");
            }
        }
    }
}
