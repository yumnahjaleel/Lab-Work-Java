//Write a Java Program to create a new file.
import java.io.*;
public class W13Q1 {
    public static void main(String[] args) {
        File f =new File("A.txt");
        try{
            if(f.createNewFile())
            {
                System.out.println("File created");
            }
            else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("Exception handled");
        }
    }
}




