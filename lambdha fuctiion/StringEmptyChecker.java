public class StringEmptyChecker 
{
    public static void main(String[] args) 
    {
        // Lambda expression to check if a string is empty
        StringChecker stringChecker = s -> s.isEmpty();

        // Test strings
        String str1 = "";
        String str2 = "Hello, world!";

        // Check if the strings are empty and print the result
        System.out.println("Is \"" + str1 + "\" empty? " + stringChecker.check(str1));
        System.out.println("Is \"" + str2 + "\" empty? " + stringChecker.check(str2));
    }

    // Functional interface with a method to check if a string is empty
    interface StringChecker 
    {
        boolean check(String s);
    }
}
