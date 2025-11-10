import java.io.*;

//Write a Java Program to copy one file into another file.

public class W13Q3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file1.txt");
        FileWriter fw = new FileWriter("file2.txt");
        int c = fr.read();
        while(c>=0) {
            fw.write((char)c);
            c = fr.read();
        }
        fr.close();
        fw.close();
    }
}
