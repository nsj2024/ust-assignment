
import java.util.ArrayList;
import java.util.List;

public class AverageOfDoubles
{

    public static void main(String[] args) 
    {
        // Sample list of doubles
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.5);
        numbers.add(3.2);
        numbers.add(4.8);
        numbers.add(8.8);

        // Using lambda expression to calculate average
        double average = numbers.stream()
                .mapToDouble(Double::doubleValue) // Convert each Double to primitive double
                .average()
                .orElse(0.0); // Provide a default value if the list is empty

        System.out.println("Average of the list: " + average);
    }
}

    

