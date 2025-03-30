import java.util.Scanner;

/**
 * This method calculates the minimum value in the array.
 * It iterates through the array to find the smallest number.
 * 
 * Time complexity: O(n), where n is the number of elements in the array.
 * The algorithm performs a linear search through the array.
 * 
 * @param arr The array to find the minimum value.
 * @return The minimum value in the array.
 */
public class task_1 {
    public static int min_num(int[] arr) {
        int min = arr[0]; // Initially assume the first element is the smallest.
        for (int i = 0; i < arr.length; i++) { // Check every element in the array.
            int num = arr[i]; // Access array element by index
            if (num < min) { // If a smaller number is found, update the minimum.
                min = num;
            }
        }
        return min; // Return the smallest number found.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Get the array elements from the user
        }
        
        System.out.println(min_num(arr)); // Output the minimum value
    }
}