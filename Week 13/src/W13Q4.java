import java.io.*;

//Write a java program to find total no. of characters in a file

public class W13Q4 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c = fr.read();
        int counter = 0;
        while(c>=0) {
            counter++;
            c = fr.read();
        }
        fr.close();
        System.out.println("No. of character: "+counter);
    }
}
