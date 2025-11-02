package week5;
import java.util.Scanner;
public class W5Q7 {
	public static void main(String[] args) {
		// largest element in an integer array
	       Scanner sc = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input array elements
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Assume first element is largest
	        int largest = arr[0];

	        // Compare with remaining elements
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > largest) {
	                largest = arr[i];
	            }
	        }

	        // Output result
	        System.out.println("The largest element in the array is: " + largest);

	        sc.close();
	}
}
