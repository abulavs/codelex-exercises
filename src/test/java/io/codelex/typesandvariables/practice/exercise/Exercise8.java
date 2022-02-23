package io.codelex.typesandvariables.practice.exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutesInYear = 60 * 24 * 365;
        System.out.println("Enter minutes?");
        long minutes = input.nextLong();
        long calculateYears = (int) minutes / minutesInYear;
        long calculateDays = (int) (minutes / 60 / 24) % 365;

        System.out.println(minutes + " minute is approximately: " + calculateYears + " year and " + calculateDays + " days");
    }
}
