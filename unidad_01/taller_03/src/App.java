import org.w3c.dom.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Nodo<String, Integer, Persona> objeto = new Nodo<String, Integer, Persona>("Hola", 1, new Persona("Jose", "Alfredo"));
        System.out.println(objeto.getDato1());
        System.out.println(objeto.getDato2());
        System.out.println(objeto.getDato3());


        Nodo2<String, Integer> obj2 = new Nodo2<String,Integer>("Hola mundo", 123);
        System.out.println( obj2.getDato2() );
        Nodo2<String, String> obj3 = new Nodo2<String,Integer>("Hola mundo", "UPS");
        System.out.println( obj3.getDato2() );
    }
}
