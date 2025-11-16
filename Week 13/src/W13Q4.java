//Write a java program to find total no. of characters in a file.
import java.io.*;
public class W13Q4 {
    public static void main(String[] args) throws IOException
    {
        int count=0;
        try{
            FileReader fr = new FileReader("b.txt");
            int c;
            while((c=fr.read())!= -1){ // read each character
                count++; // count it
            }
            System.out.print("Number of characters: "+count);
            fr.close();
        }
        catch (IOException e) {
            System.out.println("Error!");
        }
    }
}

