import java.util.Scanner;
public class W7Q9 {

    // Function to perform Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);   // Sort left part
            quickSort(arr, pivot + 1, high);  // Sort right part
        }
    }

    // Partition function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {  // If element smaller than pivot
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

