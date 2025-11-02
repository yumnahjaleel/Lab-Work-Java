public class W7Q5 {
    public static int fact(int n){
//        via function
//        int fact=1;
//        for(int i=1;i<=x;i++){
//            fact = fact*i;
//        }
//        return fact;
        // via recursion
        if(n==0||n==1) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+n+" is "+ fact(n));
    }
}
