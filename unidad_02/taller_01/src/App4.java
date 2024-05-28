import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App4 {
    public static void main(String[] args) {
        Pattern myPattern = Pattern.compile("([a-zA-Z0-9._%-]+)@([a-zA-Z0-9.-]+).([a-zA-Z]{2,6})");
        //Matcher myMatcher = myPattern.matcher("=ssss- ***çhola@4geeks.com#(+++) %&");
        Matcher myMatcher = myPattern.matcher("=ssss- ***ç.@-.az#(+++) %&");
        while (myMatcher.find()) {
            System.out.println("Encontrado: " + myMatcher.group());
        }
    }
}
