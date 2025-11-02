package week4;
import java.util.Scanner;
public class W4Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // read first character of input
        // Convert to lowercase for easier comparison
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') { //check if alphabet
            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("The input is not an alphabet.");
        }
        sc.close();
	}
}
