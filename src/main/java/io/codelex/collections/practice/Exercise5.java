package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> intigerList = new ArrayList<>();
        System.out.println("Enter number?");
        String userNumber = input.nextLine();
        String[] userarray = userNumber.split("");
        int sum = 0;
        do {
            for (int i = 0; i < userarray.length; i++) {
                intigerList.add((int) Math.pow(Integer.parseInt(userarray[i]), 2));
                if (i == userarray.length - 1) {
                    System.out.print((Integer.parseInt((userarray[i])) + "^2 "));
                } else {
                    System.out.print((Integer.parseInt((userarray[i])) + "^2 + "));
                }
            }
            for (int number : intigerList) {
                sum += number;
            }
            System.out.println("= " + sum);
            if (sum == 1 || sum == 4) {
                break;
            }
            intigerList.removeAll(intigerList);
            userarray = String.valueOf(sum).split("");
            sum = 0;
        } while (true);
        if (sum == 1) {
            System.out.println("Integer is happy");
        } else {
            System.out.println("Integer is not happy");
        }
    }

}
