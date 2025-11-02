import java.util.Scanner;
public class W6Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize two variables for largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                // Update both
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                // Update only secondLargest
                secondLargest = arr[i];
            }
        }

        // Display result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
        sc.close();
    }
}

