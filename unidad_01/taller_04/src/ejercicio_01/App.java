package ejercicio_01;
public class App {
    public static void main(String[] args) throws Exception {
        Celda obj1 = new Celda();
        obj1.setDato( "Hola mundo" );
        System.out.println( (String) obj1.getDato() );

        Celda obj2 = new Celda();
        obj2.setDato( 12345 );
        System.out.println( (int) obj2.getDato() );
    }
}
