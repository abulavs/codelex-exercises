package codelex.typesandvariables.practice.exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter meters?");
        int meters = input.nextInt();
        System.out.println("Enter hours?");
        int hours = input.nextInt();
        System.out.println("Enter minutes");
        int minutes = input.nextInt();
        System.out.println("Enter seconds?");
        int seconds = input.nextInt();
        double speedMetersInSecond = (double) meters / ((hours * 60 * 60) + (minutes * 60) + seconds);
        float speedKilometersInHour = (((float) meters / 1000) / (hours + ((float) minutes / 60) + ((float) seconds / 60 / 60)));
        double speedMilesInHour = ((double) meters / 1609) / (hours + ((double) minutes / 60) + ((double) seconds / 60 / 60));

        System.out.println(String.format("%.8f", speedMetersInSecond));
        System.out.println(String.format("%.8f", speedKilometersInHour));
        System.out.println(String.format("%.8f", speedMilesInHour));
    }
}


