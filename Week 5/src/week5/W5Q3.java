package week5;
public class W5Q3 {
	public static void main(String[] args) {
        int n = 5; // number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // move to next line
        }
	}
}
