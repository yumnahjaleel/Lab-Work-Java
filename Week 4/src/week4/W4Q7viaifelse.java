package week4;
import java.util.Scanner;
public class W4Q7viaifelse {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input four numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();
        
        // Assume first number is smallest
        int smallest = num1;
        // Compare with other numbers
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
  
        System.out.println("The smallest number is: " + smallest);
        sc.close();
	}
}
