package com.kevinbooms.ClassesAndObjects;

import java.io.*;

public class FileIO {

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Testing writer output");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
