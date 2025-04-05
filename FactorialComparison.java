// Write your name here

// 4. Factorial comparison with Recursion

public class FactorialComparison {

    // Write your code here

    public static void main(String[] args) {
        int n = 25;

        // Recursive approach
        long startTimeRecursive = System.nanoTime();
        long recursiveResult = factorialRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long recursiveTime = endTimeRecursive - startTimeRecursive;

        // Iterative approach
        long startTimeIterative = System.nanoTime();
        long iterativeResult = factorialIterative(n);
        long endTimeIterative = System.nanoTime();
        long iterativeTime = endTimeIterative - startTimeIterative;

        System.out.println("Recursive factorial of " + n + ": " + recursiveResult);
        System.out.println("Iterative factorial of " + n + ": " + iterativeResult);
        // System.out.println("Recursive time: " + recursiveTime / 1000000.0 + " milliseconds");
        // System.out.println("Iterative time: " + iterativeTime / 1000000.0 + " milliseconds");
        System.out.println((recursiveTime > iterativeTime ? "Recursive time > Iterative time: " : "Iterative time >= Recursive time: "));
    }
}
