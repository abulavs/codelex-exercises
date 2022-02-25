package io.codelex.arithmetic.practice.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number?");
        int a = input.nextInt();
        System.out.println("Enter second number?");
        int b = input.nextInt();

        if (a == 15 || b == 15) {
            System.out.println("true");
        } else if (a + b == 15 || a - b == 15 || b - a == 15) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
