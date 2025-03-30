import java.util.Scanner;

/**
 * This method checks whether a given number is prime.
 * It divides the number by increasing integers and checks for divisibility.
 * 
 * Time complexity: O(√n), where n is the input number.
 * The algorithm checks divisibility up to the square root of n.
 * 
 * @param n The number to check.
 * @return true if n is prime, false otherwise.
 */
public class task_3 {
    public static boolean prime(int n) {
        if (n <= 1) 
            return false; // Numbers less than or equal to 1 are not prime.
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisibility up to √n.
            if (n % i == 0) 
                return false; // If n is divisible by i, it's not prime.
        }
        return true; // If no divisors were found, the number is prime.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the number from the user
        
        System.out.println(prime(n)); // Output whether the number is prime
    }
}

