package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    static volatile int sum = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number?");
        String userNumber = input.nextLine();
        String[] userArray = userNumber.split("");

        do {
            sum = calculateSum(userArray);
            userArray = String.valueOf(sum).split("");

            if (sum == 1) {
                System.out.println("Integer is happy");
                break;
            }
            if (sum == 4) {
                System.out.println("Integer is not happy");
                break;
            }
            sum = 0;
        } while (true);
    }

    private static int calculateSum(String[] userArray) {
        List<Integer> integerList = new ArrayList<>();

        for (String s : userArray) {
            integerList.add((int) Math.pow(Integer.parseInt(s), 2));
        }

        for (int number : integerList) {
            sum += number;
        }
        integerList.removeAll(integerList);
        System.out.println(sum);
        return sum;
    }

/*    private static void printOutCalculation(String[] userArray, List<Integer> integerList, int sum) {

        do {
            for (int i = 0; i < userArray.length; i++) {
                integerList.add((int) Math.pow(Integer.parseInt(userArray[i]), 2));
                if (i == userArray.length - 1) {
                    System.out.print((Integer.parseInt((userArray[i])) + "^2 "));
                } else {
                    System.out.print((Integer.parseInt((userArray[i])) + "^2 + "));
                }
            }
            for (int number : integerList) {
                sum += number;
            }
            System.out.println("= " + sum);
            if (sum == 1 || sum == 4) {
                break;
            }
            integerList.removeAll(integerList);
            userArray = String.valueOf(sum).split("");
            sum = 0;
        } while (true);
    }*/
}
