import java.util.Scanner;
public class W6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Swap first and last elements
        if (n > 1) {   // Only swap if array has at least 2 elements
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
        }

        System.out.println("Array after swapping first and last elements:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

