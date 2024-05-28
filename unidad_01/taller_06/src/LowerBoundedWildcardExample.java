import java.util.List;
import java.util.ArrayList;

public class LowerBoundedWildcardExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(numberList);
    }
}