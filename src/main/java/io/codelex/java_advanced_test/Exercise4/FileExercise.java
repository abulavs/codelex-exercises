package io.codelex.java_advanced_test.Exercise4;

import java.io.File;

public class FileExercise<T> {
    File inputFile;
    File outputFile;

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = new File(inputFile);
    }

    public void setOutputFile() {
        String[] splitInputFile = inputFile.getName().split("\\.");
        String fileNameReverse = new StringBuilder(splitInputFile[0]).reverse()
                + "." + splitInputFile[1];
        this.outputFile = new File(fileNameReverse);
    }

    public String reverseLine(T value) {
        String convertToText = String.valueOf(value);
        String result = new StringBuilder(convertToText).reverse().toString();

        return result;
    }

    public File getOutputFile() {
        return outputFile;
    }


}
