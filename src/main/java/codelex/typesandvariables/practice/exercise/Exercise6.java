package codelex.typesandvariables.practice.exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userDigitCount = 5;
        int sum = 0;
        int userDigit;
        for (int i = 1; i < userDigitCount + 1; i++) {
            System.out.println("Enter " + i + ". digit?");
            userDigit = input.nextInt();
            sum += userDigit;
            do {
                if (userDigit > 10 || userDigit < 0) {
                    System.out.println("This is not single digit. Try Again.");
                    userDigit = input.nextInt();
                }
            }
            while ((userDigit > 10 || userDigit < 0));
        }
        System.out.println("Sum of entered digits is " + sum);
    }
}
