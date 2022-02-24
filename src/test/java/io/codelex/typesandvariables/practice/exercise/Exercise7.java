package io.codelex.typesandvariables.practice.exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String upperCaseLetters = "QWERTYUIOPASDFGHJKLZXCVBNMĀŠČŅŽĻĶĢĒŪĪ";
        int count = 0;
        System.out.println("Please enter word?");
        String userInput = input.next();
        for (int i = 0; i < userInput.length(); i++) {

            for (int j = 0; j < upperCaseLetters.length(); j++) {
                if (userInput.charAt(i) == upperCaseLetters.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println("Uppercase letters in the string: "+count);
    }
}
