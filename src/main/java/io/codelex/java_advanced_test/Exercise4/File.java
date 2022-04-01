package io.codelex.java_advanced_test.Exercise4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("io/codelex/java_advanced_test/Exercise4/File.java");
        FileOutputStream out = new FileOutputStream("fileOutput.txt");
        int data;
        List<Integer> temp = new ArrayList<>();
        while ((data = in.read()) != -1) {
            temp.add(data);
        }
        for (int i = temp.size(); i > 0; i--) {
            out.write(temp.get(i));
        }
    }


}
