import java.util.Scanner;
public class W6Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N: " );
        int n=sc.nextInt();
        System.out.println("the fibonacci series is ");
        //System.out.print("0 ");
        for(int i=0;i<n;i++){
            System.out.print(Fib(i)+" ");
        }
        sc.close();
    }
    public static int Fib(int n){
        if (n==0 || n==1) return n;

        return Fib(n-1)+Fib(n-2);
    }
}
