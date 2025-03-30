import java.util.Scanner;

/**
 * This method calculates the nth Fibonacci number using recursion.
 * It calls the function recursively for the previous two Fibonacci numbers.
 * 
 * Time complexity: O(2^n), where n is the input number.
 * The algorithm has exponential time complexity due to repeated calculations.
 * 
 * @param n The index of the Fibonacci number.
 * @return The nth Fibonacci number.
 */
public class task_5 {
    public static int fibonacci(int n) {
        if (n <= 1) 
            return n; // Base case: F0 = 0, F1 = 1.
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: F(n) = F(n-1) + F(n-2).
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the index from the user
        
        System.out.println(fibonacci(n)); // Output the Fibonacci number
    }
}
