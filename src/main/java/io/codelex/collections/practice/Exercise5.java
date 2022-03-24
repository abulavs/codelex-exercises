package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter number?");
        String userNumber = input.nextLine();
        String[] userArray = userNumber.split("");
        int sum = 0;

        printOutCalculation(userArray, integerList, sum);

        if (sum == 1) {
            System.out.println("Integer is happy");
        } else {
            System.out.println("Integer is not happy");
        }

    }

    private static void printOutCalculation(String[] userArray, List<Integer> integerList, int sum) {
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
    }
}
