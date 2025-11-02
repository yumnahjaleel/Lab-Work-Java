package week4;
import java.util.Scanner;
public class W4Q1 {

	public static void main(String[] args) {
		// ODD EVEN
		Scanner sc = new Scanner(System.in);
        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        sc.close();
	}

}
