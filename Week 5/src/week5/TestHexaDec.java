package week5;
import java.util.Scanner;
public class TestHexaDec {
	     public static void main(String[] args) {      
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Choose conversion:");
	         System.out.println("1. Decimal to Hexadecimal");
	         System.out.println("2. Hexadecimal to Decimal");
	         System.out.print("Enter choice (1 or 2): ");
	         int choice = sc.nextInt();
	         sc.nextLine();
		        if (choice == 1) {
		             System.out.print("Enter a decimal number: ");
		             int decimal = sc.nextInt(); //reads integer input.
		             String hex = Integer.toHexString(decimal).toUpperCase();
		             System.out.println("Hexadecimal: " + hex);
		         } else if (choice == 2) {
		             System.out.print("Enter a hexadecimal number: ");
		             String hex = sc.nextLine(); //reads string input
		             int decimal = Integer.parseInt(hex, 16);
		             System.out.println("Decimal: " + decimal);
		         } else {
		             System.out.println("Invalid choice!");
	         }
	        sc.close();
	     }
	 }
