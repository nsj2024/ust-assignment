public class Addition {
    public static void main(String[] args) {
        // Lambda expression to calculate the sum of two integers
        SumCalculator sumCalculator = (a, b) -> a + b;

        // Two integers to find the sum
        int num1 = 10;
        int num2 = 20;

        // Calculate and print the sum
        int sum = sumCalculator.calculate(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    // Functional interface with a method to calculate the sum
    interface SumCalculator {
        int calculate(int a, int b);
    }
}
