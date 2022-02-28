package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word?");
        String firstWord = input.nextLine();
        System.out.println("Enter second Word");
        String secondWord = input.nextLine();
        int lineCount = 30;
        int dotCount = lineCount - firstWord.length() - secondWord.length();
        String dot = ".";
//first version
        System.out.println(firstWord + dot.repeat(dotCount) + secondWord);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//second version
        int totalWordLetterCount = firstWord.length() + secondWord.length();

        System.out.print(firstWord);
        for (int i = totalWordLetterCount; i < lineCount; i++) {
            System.out.print(dot);
        }
        System.out.print(secondWord);
    }
}

