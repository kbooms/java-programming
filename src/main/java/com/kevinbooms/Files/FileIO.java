package com.kevinbooms.Files;

import java.io.*;

public class FileIO {

    public Object writeFile(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"));
            System.out.println("Writing changes...");
            writer.write("Calling File Writer from a method");
            writer.write("\nWriting to a file from a method");
            writer.close();
            System.out.println("Writer closed...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName + ".txt";
    }

    public Object readFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName + ".txt"));
            String line;
            System.out.println("Reading file...");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            System.out.println("Reader Closed...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName + ".txt";
    }
}
