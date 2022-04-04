package io.codelex.java_advanced_test.Exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) throws IOException {
        FileExercise fileExercise = new FileExercise<>();
        fileExercise.setInputFile("src/main/java/io/codelex/java_advanced_test/Exercise4/file.txt");
        fileExercise.setOutputFile();
        FileReader in = new FileReader(fileExercise.getInputFile());
        FileWriter out = new FileWriter(fileExercise.getOutputFile());

        BufferedReader input = new BufferedReader(in);
        List<String> list = new ArrayList<>();

        String line;
        while ((line = input.readLine()) != null) {
            System.out.println(line);
            list.add(fileExercise.reverseLine(line));
        }
        input.close();

        Collections.reverse(list);

        for (String s : list) {
            System.out.println(s);
            out.write(s);
        }


    }
}
