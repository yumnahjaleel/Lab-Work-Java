//Write a Java function to implement binary search.
import java.util.Scanner;
public class W7Q1 {
    public static int binarySearch(int[] arr,int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return key;
            }
            else if (arr[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
                } 
            }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,5,7,9};
        System.out.println("Enter the element to be searched:");
        int key=sc.nextInt();
        int result = binarySearch(arr,key);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+result);
        }
    }
}
