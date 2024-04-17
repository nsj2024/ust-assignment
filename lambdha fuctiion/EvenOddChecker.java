import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EvenOddChecker 
{ 
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}