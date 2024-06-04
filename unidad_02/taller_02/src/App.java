import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "^[a-z]{5,10}\\d*@(ups.edu.ec|est.ups.edu.ec)";
        Pattern patron = Pattern.compile(cadena);

        String ejemplo = "1gpizarro1@est.ups.edu.ec";
        Matcher verificador = patron.matcher(ejemplo);

        while(verificador.find()) {
            System.out.println( verificador.group() + " " + verificador.start() );
        }

        System.out.println( ejemplo.matches(cadena) );
    }
}
