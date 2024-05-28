import java.util.List;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("uno", "dos", "tres");
        printList(stringList);

        List<Integer> intList = List.of(1, 2, 3);
        printList(intList);
    }
}

