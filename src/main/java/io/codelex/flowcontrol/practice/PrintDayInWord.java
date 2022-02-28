package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number? (1-7)");
        int day = input.nextInt();
        while (day < 1 || day > 7) {
            System.out.println("Please enter a valid day number: 1, 2, 3, 4, 5, 6 or 7");
            day = input.nextInt();
        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
        }
    }
}
