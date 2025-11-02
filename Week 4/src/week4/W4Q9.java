package week4;
import java.util.Scanner;
public class W4Q9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        // Leap year conditions:
        // 1. Divisible by 400 -> Leap year
        // 2. Divisible by 4 but not by 100 -> Leap year
        // Otherwise -> Not a leap year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        sc.close();
	}
}
