package week4;
import java.util.Scanner;
public class W4Q4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input N
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        // Using loop to calculate sum
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("The sum of the series 1 + 2 + ... + " + N + " is: " + sum);
        sc.close();
	}
}
