import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://4geeks.com/es/lesson/expresiones-regulares-java
public class App {
    public static void main(String[] args) throws Exception {
        Pattern patron = Pattern.compile("\\w+");
        Matcher matcher = patron.matcher("=((4_geeks %&Academy$·$%$·$·");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group() + " en: " + matcher.start() + "," + matcher.end());
        }
    }
}
