import java.util.List;

public class UpperBoundedWildcardExample {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        System.out.println("Sum: " + sumOfList(intList));

        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        System.out.println("Sum: " + sumOfList(doubleList));
    }
}

