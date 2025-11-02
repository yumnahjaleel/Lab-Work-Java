import java.util.Scanner;
public class W6Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to be found: ");
        int x = sc.nextInt();

        boolean found = false;   // flag to track if element exists
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                System.out.println("Element found at index " + i);
                found = true;
                break;   // stop searching once found
            }
        }
        if(!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}

