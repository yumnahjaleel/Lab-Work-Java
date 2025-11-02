public class W6Q1 {
    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 99 are:");

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {   // check if the number is odd
                System.out.print(i + " ");
            }
        }
    }
}
