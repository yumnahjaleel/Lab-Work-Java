package week4;
import java.util.Scanner;
public class W4Q10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are:");

        // Loop to find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
	}
}
