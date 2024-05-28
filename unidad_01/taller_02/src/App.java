import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Personaje> superHeroes = new ArrayList<Personaje>();

        Personaje obj1 = new Personaje("Steve", "Rogers", "Capitán América", 80, "BUENA_GENTE");
        superHeroes.add(obj1);
        Personaje obj2 = new Personaje("Jean", "Grace", "Phoenix Force", 95, "BUENA_GENTE");
        superHeroes.add(obj2);
        Personaje obj3 = new Personaje("Thanos", "", "Rey Thanos", 98, "MALA_GENTE");
        superHeroes.add(obj3);

        for (Personaje obj: superHeroes) {
            System.out.println(obj);
        } 
    }   
}
