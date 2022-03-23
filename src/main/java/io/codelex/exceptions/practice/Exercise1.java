package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        while (true) {
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (InputMismatchException e) {
                if (scanner.nextLine().toLowerCase().charAt(0) == 'q') {
                    break;
                }
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
            }
        }
    }
}

