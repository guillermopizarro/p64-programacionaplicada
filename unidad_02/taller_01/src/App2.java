// https://4geeks.com/es/lesson/expresiones-regulares-java
public class App2 {
    public static void main(String[] args) {
        String myString = "123   %usuario1usuario2$%&";

        String myPattern1 =  "\\s+";
        Boolean matchExists1 = myString.matches(myPattern1);

        String myPattern2 =  ".*\\s+.*";
        Boolean matchExists2 = myString.matches(myPattern2);

        System.out.println("Se han encontrado palabras: " + matchExists1);
        System.out.println("Se han encontrado palabras: " + matchExists2);
    }
}
