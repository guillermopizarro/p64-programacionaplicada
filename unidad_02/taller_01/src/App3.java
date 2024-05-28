import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App3 {
    public static void main(String[] args) {
        Pattern patron = Pattern.compile("\\s+");
        Matcher matcher = patron.matcher("   %usuario1usuario2$%&");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group() + " en: " + matcher.start() + "," + matcher.end());
        }
    }
}
