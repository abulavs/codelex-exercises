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

        System.out.println(symbolOne.repeat(endLenght / 2) + symbolTwo.repeat(endLenght / 2));

        for (int i = 0; i < lineCount - 1; i++) {
            System.out.println(symbolOne.repeat((endLenght - symbolThreeStartCount) / 2) + symbolThree.repeat(symbolThreeStartCount)
                    + symbolTwo.repeat((endLenght - symbolThreeStartCount) / 2));
            symbolThreeStartCount += 8;
        }
    }
}
