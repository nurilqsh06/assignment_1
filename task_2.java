import java.util.Scanner;

/**
 * This method calculates the average of the elements in the array.
 * It sums all elements and divides by the length of the array.
 * 
 * Time complexity: O(n), where n is the number of elements in the array.
 * The algorithm performs a single pass to sum the array's elements.
 * 
 * @param arr The array of numbers.
 * @return The average value of the array elements.
 */
public class task_2 {
    public static double a(int[] arr) {
        int sum = 0; // Variable to store the sum of the elements.
        for (int i = 0; i < arr.length; i++) { // Iterate through the array to sum the elements.
            int num = arr[i]; // Access array element by index
            sum += num; // Add each element to the sum.
        }
        return (double) sum / arr.length; // Return the average by dividing the sum by the length.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Get the size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Get the array elements from the user
        }
        
        System.out.println(a(arr)); // Output the average value
    }
}
