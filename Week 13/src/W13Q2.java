//Write a Java Program to write into a file.
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class W13Q2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter f =new FileWriter("A.txt"); ;
        try {
            f = new FileWriter("A.txt");
            System.out.println("Enter the content to be written into the file: ");
            String string = sc.nextLine();
            f.write(string);
            System.out.println("Successfully wrote data!");
        } catch (IOException e) {
            System.out.println("Unable to write into file!");
        } finally {
            f.close();
            sc.close();
        }
    }
}
