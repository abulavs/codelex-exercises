package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();

        String[] scoresArray = scores.split(" ");
        List<Integer> scoresList = new ArrayList<>();
        fillScoresList(scoresArray, scoresList);

        List<Integer> rangeListToCompare = new ArrayList<>();

        getResultAndPrintOutScores(rangeListToCompare, scoresList, scoresArray);

    }


    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static void fillScoresList(String[] scoresArray, List<Integer> scoresList) {
        for (String s : scoresArray) {
            scoresList.add(Integer.parseInt(s));
        }
    }

    private static void getResultAndPrintOutScores(List<Integer> rangeList, List<Integer> scoresList, String[] scoresArray) {
        String star = "*";
        int startPosition = 0;
        int endPosition = 9;

        while (true) {
            for (int i = startPosition; i <= endPosition; i++) {
                rangeList.add(i);
            }
            scoresList.removeAll(rangeList);
            if (endPosition == 9) {
                System.out.println(startPosition + "0-0" + endPosition + ": " + star.repeat(51 - scoresList.size()));
            } else if (startPosition == 100) {
                System.out.println(startPosition + ": " + star.repeat(51 - scoresList.size()));
                break;
            } else if (endPosition == 99) {
                System.out.println(startPosition + "-" + endPosition + ": " + star.repeat(51 - scoresList.size()));
            } else {
                System.out.println(startPosition + "-" + endPosition + ": " + star.repeat(51 - scoresList.size()));
            }

            rangeList.removeAll(rangeList);
            scoresList.removeAll(scoresList);
            fillScoresList(scoresArray, scoresList);
            startPosition += 10;
            endPosition += 10;
        }
    }
}
