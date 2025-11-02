import java.util.Scanner;
public class W6Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase to make counting case-insensitive (optional)
        str = str.toLowerCase();

        // Convert string to character array
        char[] chars = str.toCharArray();

        System.out.println("\nCharacter Frequencies:");
        // Loop through each character
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            // Skip already counted or spaces
            if (ch == ' ' || ch == '0')
                continue;

            int count = 1;

            // Count frequency of this character
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == ch) {
                    count++;
                    // Mark as counted
                    chars[j] = '0';
                }
            }
            // Print result
            System.out.println(ch + " → " + count);
        }
        sc.close();
    }
}

