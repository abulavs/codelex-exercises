

package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber;
        int score = 0;
        String userChoice;
        System.out.println("Welcome to Piglet!");

        do {
            randomNumber = (int) (Math.random() * (6 - 1) + 1);
            System.out.println("You rolled a " + randomNumber);
            if (randomNumber == 1) {
                score *= 0;
                break;
            }
            score += randomNumber;
            boolean isCorrectInput = false;
            do {
                System.out.println("Roll again? (y/n)");
                userChoice = input.nextLine();
                isCorrectInput = userChoice.equals("y") || userChoice.equals("n");
                if (!isCorrectInput) {
                    System.out.println("incorrect command.");
                }
            } while (!isCorrectInput);

            if (userChoice.equals("n")) {
                break;
            }
        }
        while (true);
        System.out.println("You got " + score + " points.");
    }
}


