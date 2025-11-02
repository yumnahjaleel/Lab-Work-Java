package week4;
import java.util.Scanner;
public class W4Q8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input N
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        // Loop through even numbers only
        for (int i = 2; i <= N; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all even numbers from 1 to " + N + " is: " + sum);
        sc.close();
	}
}
