package week5;
import java.util.Scanner;
public class W5Q5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10; 
            sum += digit;        
            temp /= 10;            
        }
        System.out.println("Sum of digits of " + number + " is: " + sum);
        sc.close();
	}
}
