package io.codelex.arithmetic.practice.exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomMin = 1;
        int randomMax = 100;
        int randomNumber = (int) (Math.random() * (randomMax - randomMin + 1) + randomMin);
        int userGuess;
        do {
            System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
            userGuess = input.nextInt();
            if (userGuess < randomMin || userGuess > randomMax) {
                System.out.println("Wrong number! Please try again");
            }
        }
        while (userGuess < randomMin || userGuess > randomMax);

        if (userGuess < randomNumber) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber + ".");
            System.out.println("They don't get any more guesses for now.");
        } else if (userGuess > randomNumber) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber + ".");
            System.out.println("They don't get any more guesses for now.");
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
