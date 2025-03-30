import java.util.Scanner;

/**
 * This method calculates the factorial of a number using recursion.
 * It multiplies the current number by the factorial of the previous number.
 * 
 * Time complexity: O(n), where n is the input number.
 * The algorithm performs n recursive calls.
 * 
 * @param n The number for which the factorial is to be calculated.
 * @return The factorial of the number.
 */
public class task_4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) 
            return 1; // Base case: factorial of 0 or 1 is 1.
        return n * factorial(n - 1); // Recursive case: n * factorial(n - 1).
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the number from the user
        
        System.out.println(factorial(n)); // Output the factorial value
    }
}
