package io.codelex.arithmetic.practice.exercise;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter number?");
            int a = input.nextInt();
            if (a % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
        while (input.hasNextInt());
        System.out.println("bye");
    }
}
