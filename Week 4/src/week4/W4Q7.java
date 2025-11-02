package week4;
import java.util.Scanner;
public class W4Q7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input four numbers
        System.out.print("Enter four numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        // Find smallest using Math.min()
        int smallest = Math.min(Math.min(num1, num2), Math.min(num3, num4));

        // Output
        System.out.println("The smallest number is: " + smallest);

        sc.close();
       /*Math.min(a, b) gives the smaller of two numbers
        First, Math.min(num1, num2) → gives smaller of the first two.
		Then, Math.min(num3, num4) → gives smaller of the next two.
		Finally, Math.min(... , ...) between those results → gives the overall smallest.*/
	}

}
