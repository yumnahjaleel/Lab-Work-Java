package week3;
import java.util.Scanner;
public class W3Q10 {
	public static void main(String[] args) {
		//Write a Java program to find the circumference of a circle given its radius.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius:");
		double r = sc.nextDouble();
		
		double p = 2* Math.PI * r;
		
		System.out.println("the circumference of the circle with radius " + r +" is " + p);
		
		sc.close();		
	}
}
