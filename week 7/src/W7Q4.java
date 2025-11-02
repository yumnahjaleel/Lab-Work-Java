import java.util.Scanner;
public class W7Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int leng = str.length();

        String rev = " ";

        for (int i=leng-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(rev==str){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
