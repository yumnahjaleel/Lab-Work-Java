package week5;
import java.util.Scanner;
public class W5Q2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; // add directly while reading
        }

        // Output sum
        System.out.println("The sum of all array elements is: " + sum);

        sc.close();
	}
}
