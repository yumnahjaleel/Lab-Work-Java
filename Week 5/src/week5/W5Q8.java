package week5;
import java.util.Scanner;
public class W5Q8 {
	public static void main(String[] args) {
	    // REVERSE A NUMBER   
		Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int num = sc.nextInt();
	        int reversed = 0;

	        while (num != 0) {
	            reversed = reversed * 10 + num % 10; // take last digit & add to reversed
	            num = num / 10;                      // remove last digit
	        }

	        System.out.println("Reversed number: " + reversed);
	        sc.close();
	}
}
