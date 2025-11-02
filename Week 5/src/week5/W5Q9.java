package week5;
import java.util.Scanner;
public class W5Q9 {
	public static void main(String[] args) {
		/*A palindrome number is the one that reads the same backward as forward.
		For example: 121, 12321, 454 are palindromes, while 123 is not.*/
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // input
        int temp = num;              // store original
        int rev = 0;              // reversed number

        while (num > 0) {
            rev = rev * 10 + num % 10;  // build reverse
            num = num / 10;           // drop last digit
        }

        if (temp == rev) {
            System.out.println(temp + " is a Palindrome.");
        } else {
            System.out.println(temp + " is NOT a Palindrome.");
        }

        sc.close();
	}
}
