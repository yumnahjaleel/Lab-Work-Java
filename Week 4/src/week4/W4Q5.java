package week4;
import java.util.Scanner;
public class W4Q5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        // Keep dividing until number < 10
        while (num >= 10) {
            num = num / 2;
            System.out.println("Result: " + num);
        }
        sc.close();
	}
}
