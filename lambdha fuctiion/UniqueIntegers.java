import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        List<Integer> uniqueNumbers = numbers.stream()
               .distinct()
               .collect(Collectors.toList());

        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}