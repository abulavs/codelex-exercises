package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Line count?");

        int lineCount = input.nextInt();
        int endLenght = (lineCount - 1) * 8;
        int symbolThreeStartCount = 8;
        String symbolOne = "/";
        String symbolTwo = "\\";
        String symbolThree = "*";

        String firstLineLeftPrint = symbolOne.repeat(endLenght / 2);
        String firstLineRightPrint = symbolTwo.repeat(endLenght / 2);


        System.out.println(firstLineLeftPrint + firstLineRightPrint);

        for (int i = 0; i < lineCount - 1; i++) {
            String otherLinesLeftPrint = symbolOne.repeat((endLenght - symbolThreeStartCount) / 2);
            String otherLinesMiddlePrint = symbolThree.repeat(symbolThreeStartCount);
            String otherLinesRightPrint = symbolTwo.repeat((endLenght - symbolThreeStartCount) / 2);

            System.out.println(otherLinesLeftPrint + otherLinesMiddlePrint + otherLinesRightPrint);
            symbolThreeStartCount += 8;
        }
    }
}
