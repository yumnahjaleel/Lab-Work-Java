import java.util.Scanner;
public class W6Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input size and array;
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Choose: ");
        System.out.println("1.Find maximum element");
        System.out.println("2.Find minimum element");
        System.out.println("Enter choice: ");
        int choice= sc.nextInt();

        int max=arr[0];
        int min=arr[0];
        if(choice==1) {
            for (int i = 0; i < n;i++){
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("The largest element is " + max);
        }
        else if(choice==2) {
            for (int i = 0; i < n; i++) {
                if (arr[i] <min) {
                    min = arr[i];
                }
            }
            System.out.println("The smallest element is " + min);
        }
        else{
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
