import java.util.Scanner;
public class W6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true; // Check prime
        if (num <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            // Only check up to sqrt(num) for efficiency
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        // Output
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
        sc.close();
    }
}
