//Write a Java Program to create a new file.

import java.io.*;

public class W13Q1 {
    public static void main(String[] args) throws Exception {

        File file = new File("abc.txt");
        if (file.createNewFile()) {
            System.out.println("File created successfully: " + file.getName());
        }
        else {
            System.out.println("File already exists.");
        }
    }
}


