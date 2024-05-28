public class App {
    public static void main(String[] args) {
        Nodo<Float> objeto = new Nodo<Float>();
        objeto.setDato( (float) 34.5);
        System.out.println( objeto.getDato() );

        Nodo<Boolean> objeto2 = new Nodo<Boolean>();
        objeto2.setDato( Boolean.TRUE );
        System.out.println( objeto2.getDato() );

        Persona personita = new Persona("Luis", "Armijos");
        Nodo<Persona> objeto3 = new Nodo<Persona>();
        objeto3.setDato( personita );
        System.out.println( objeto3.getDato() );
    }
}
