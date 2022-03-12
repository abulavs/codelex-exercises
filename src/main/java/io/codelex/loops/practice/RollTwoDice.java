package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter desired sum? (2-12)");

        int desiredSum = input.nextInt();
        while (desiredSum < 2 || desiredSum > 12) {
            System.out.println("Incorrect number");
            desiredSum = input.nextInt();
        }

        Random rand = new Random();
        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
        int sum;
        System.out.println("Desired sum: " + desiredSum);
        do {
            System.out.println(a + " and " + b + " = " + (a + b));
            sum = a + b;
            a = rand.nextInt(6);
            a += 1;
            b = rand.nextInt(6);
            b += 1;
        }
        while (!(sum == desiredSum));
    }
}
