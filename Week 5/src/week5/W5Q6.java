package week5;
import java.util.Scanner;
public class W5Q6 {
	public static void main(String[] args) {
		// FACTORIAL
	       Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        long fact = 1;  // use long to avoid overflow for larger numbers

	        // Factorial logic: n! = 1 × 2 × 3 × ... × n
	        for (int i = 1; i <= num; i++) {
	            fact *= i;
	        }

	        // Output
	        System.out.println("Factorial of " + num + " is: " + fact);

	        sc.close();
	}
}
