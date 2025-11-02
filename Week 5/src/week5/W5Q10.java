package week5;
import java.util.Scanner;
public class W5Q10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal to Hexadecimal
        System.out.print("Enter a decimal number: ");
        int d = sc.nextInt();
        String h = Integer.toHexString(d);   // decimal to hex
        System.out.println("Hexadecimal: " + h.toUpperCase());

        // Hexadecimal to Decimal
        System.out.print("Enter a hexadecimal number: ");
        String hx = sc.next();  
        int dec = Integer.parseInt(hx, 16);  // hex to decimal
        System.out.println("Decimal: " + dec);

        sc.close();
	}
}
