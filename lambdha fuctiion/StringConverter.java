import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class StringConverter 
{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Lambda", "Expressions");

        // Convert strings to uppercase
        List<String> uppercaseStrings = convertStrings(strings, str -> str.toUpperCase());
        System.out.println("Uppercase strings: " + uppercaseStrings);

        // Convert strings to lowercase
        List<String> lowercaseStrings = convertStrings(strings, str -> str.toLowerCase());
        System.out.println("Lowercase strings: " + lowercaseStrings);
    }

    public static List<String> convertStrings(List<String> strings, Function<String, String> converter) 
    {
        List<String> convertedStrings = strings.stream()
                .map(converter)
                .toList();
        return convertedStrings;
    }
}