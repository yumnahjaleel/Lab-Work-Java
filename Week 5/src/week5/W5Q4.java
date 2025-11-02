package week5;
import java.util.Scanner;
public class W5Q4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        // Loop to calculate sum of series
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;  // use 1.0 to ensure floating point division
        }

        // Output result
        System.out.println("The sum of the series 1 + 1/2 + ... + 1/" + n + " is: " + sum);

        sc.close();

	}
}
