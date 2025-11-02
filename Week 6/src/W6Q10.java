import java.util.Scanner;
public class W6Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Input Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // reversing an array
        for(int i=0; i<n/2;i++){
            int temp= arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("Reversed array:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
