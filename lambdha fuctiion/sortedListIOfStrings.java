
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class sortedListIOfStrings 
{
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("kiwi");
        strings.add("orange");

        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted strings: " + strings);
    }
}
    

