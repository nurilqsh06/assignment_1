import java.util.Scanner;

/**
 * This method checks whether the string consists of only digits.
 * It recursively checks each character of the string.
 * 
 * Time complexity: O(n), where n is the length of the string.
 * The algorithm checks each character once.
 * 
 * @param s The string to check.
 * @param i The current index to check in the string.
 * @return true if the string contains only digits, false otherwise.
 */
public class task_8 {
    public static boolean digit(String s, int i) {
        if (i == s.length()) 
            return true; // Base case: if all characters have been checked, return true.
        if (!Character.isDigit(s.charAt(i))) 
            return false; // If a non-digit character is found, return false.
        return digit(s, i + 1); // Recursively check the next character.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Get the string from the user
        
        System.out.println(digit(s, 0)); // Output whether the string is digits only
    }
}
