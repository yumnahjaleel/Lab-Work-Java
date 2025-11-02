import java.util.Scanner;
public class W7Q6nonRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input how many terms to print
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: ");

        // Print first two terms
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b; // Next term = sum of previous two
            a = b;
            b = c;
        }
        sc.close();
    }
}

