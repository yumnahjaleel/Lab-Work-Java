//Write a Java Program to copy one file into another file.
import java.io.*;
public class W13Q3 {
    public static void main(String[] args) throws IOException
    {
        try{
            BufferedReader freader = new BufferedReader(new FileReader("A.txt"));
            BufferedWriter fwriter = new BufferedWriter(new FileWriter("B.txt"));

            String line;

            while ((line = freader.readLine()) != null){
                fwriter.write(line);
            }
            freader.close();
            fwriter.close();

            System.out.println("File copied successfully!");
        }
        catch (IOException e){
            System.out.println("Unable to do so!");
        }
    }
}

