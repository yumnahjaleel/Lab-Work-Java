import java.io.*;

//Write a Java Program to write into a file.

public class W13Q2 {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("file.txt");
        fw.write("Hello world!");
        fw.write(" This is java.");
        fw.close();
    }
}
