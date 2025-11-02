import java.util.Arrays;
import java.util.Scanner;
public class W7Q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st string: ");
        String str1= sc.nextLine();
        System.out.print("enter 2nd string:");
        String str2=sc.nextLine();
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            System.out.println("Not anagram");
        }
        int flag = 0;
        for(int i=0;i<arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
//        if(Arrays.equals(arr1,arr2)){
//            System.out.println("anagrams");
//        }
//        else{
//            System.out.println("not anagrams");
//        }
        sc.close();
    }
}
