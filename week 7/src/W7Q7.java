public class W7Q7 {
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }
        return GCD(b, a%b);
    }

    public static void main(String[] args) {
        int a = 45, b=20;
        System.out.println(GCD(a,b));
    }
}
