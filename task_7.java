import java.util.Scanner;

/**
 * This method prints the elements of the array in reverse order using recursion.
 * It starts from the last element and works its way back to the first.
 * 
 * Time complexity: O(n), where n is the number of elements in the array.
 * The algorithm performs a recursive call for each element in the array.
 * 
 * @param arr The array to reverse.
 * @param index The current index to print.
 */
public class task_7 {
    public static void reverse(int[] arr, int index) {
        if (index < 0) 
            return; // Base case: if index is less than 0, stop the recursion.
        System.out.print(arr[index] + " "); // Print the current element.
        reverse(arr, index - 1); // Recursively call the function with the previous index.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Get the array elements from the user
        }
        reverse(arr, arr.length - 1); // Output the reversed array
    }
}
