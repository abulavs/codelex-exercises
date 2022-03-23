package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void main(String[] args) {
        cat(new File("C:\\dati\\fil.txt"));
    }

    public static void cat(File file) {

        //TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("File not found");
                }
            }
        }
    }
}
