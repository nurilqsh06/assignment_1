import java.util.Scanner;

/**
 * This method calculates the power of a number using recursion.
 * It multiplies the number by itself for n times.
 * 
 * Time complexity: O(n), where n is the exponent.
 * The algorithm performs n recursive calls.
 * 
 * @param a The base number.
 * @param n The exponent to which the base is raised.
 * @return The value of a raised to the power of n.
 */
public class task_6 {
    public static int power(int a, int n) {
        if (n == 0) 
            return 1; // Base case: any number to the power of 0 is 1.
        return a * power(a, n - 1); // Recursive case: a * power(a, n - 1).
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // Get the base number from the user
        int n = scanner.nextInt(); // Get the exponent from the user
        
        System.out.println(power(a, n)); // Output the result
    }
}
