import java.util.Scanner;

//Create a class MathOperations with two static methods:
// findGCD(int a, int b) to calculate the greatest common divisor and
// findLCM(int a, int b) to calculate the least common multiple.
// Call these methods without creating an object of MathOperations.
class MathOperations {
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    static int findLCM(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return ((a * b) / findGCD(a, b));
        }
    }
}
    public class W9Q9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number 1: ");
            int n1 = sc.nextInt();

            System.out.print("Enter number 2: ");
            int n2 = sc.nextInt();

            System.out.println("GCD: "+MathOperations.findGCD(n1, n2));
            System.out.println("LCM: "+MathOperations.findLCM(n1, n2));
    }
}
