import java.util.Scanner;
public class LCM {
    public static int GCD(int a, int b){
//        if (b==0){
//            return a;
//        }else{
//            return GCD(b,a%b);
//        }
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int LCM= (a*b)/GCD(a,b);
        System.out.println("The LCM is "+LCM);
    }
}
