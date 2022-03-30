package io.codelex.oop.runners;

import java.util.Scanner;

public class RunnerMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 1km time in minutes");
        int time = input.nextInt();

        Runner runner = Runner.getFitnessLevel(time);
        System.out.println(runner);
    }
}
