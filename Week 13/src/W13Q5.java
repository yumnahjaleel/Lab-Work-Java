//Write a java program to find total no. of lines in a file.
import java.io.IOException;
import java.io.*;
public class W13Q5 {
    public static void main(String[] args) {
        int lineCount=0;
        try{
            BufferedReader f = new BufferedReader(new FileReader("A.txt"));

            String line;
            while((line=f.readLine())!=null){
                lineCount++;
            }
            f.close();
            System.out.println("Total number of lines in the file: "+lineCount);
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}

