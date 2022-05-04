package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        List<String> lines = Files.readAllLines(path, charset);

        System.out.println("Lines = " + lines.size());
        wordsCount(lines);
        chartersCount(lines);

    }

    private static void wordsCount(List<String> lines) {
        int words = 0;
        for (String line : lines) {
            StringTokenizer tokens = new StringTokenizer(line.replaceAll("[^a-zA-Z0-9]", " "));
            words += tokens.countTokens();
        }
        System.out.println("Words = " + words);
    }

    private static void chartersCount(List<String> lines) {
        int charsCount = 0;
        for (String line : lines) {
            charsCount += line.length();
        }
        System.out.println("Chars = " + charsCount);
    }

}

