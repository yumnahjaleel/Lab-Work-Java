package week4;
import java.util.Scanner;
public class W4Q3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Print multiplication table up to 10
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
	}
}

