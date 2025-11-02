public class W6Q7 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int n = 2; n <= 100; n++) {  // Start from 2 since 1 is not prime
            boolean isPrime = true;

            // Check divisibility
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Print if prime
            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
