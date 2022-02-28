package io.codelex.loops.practice;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start number?");
        int startNumber = input.nextInt();
        System.out.println("Enter end number?");
        int endNumber = input.nextInt();
        int[] numberArray = new int[endNumber - startNumber + 1];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = startNumber + i;
        }
        String numberList = Arrays.toString(numberArray).replaceAll("\\[|\\]|,|\\s", "");
        System.out.println(numberList);

        for (int j = 1; j < numberList.length(); j++) {
            System.out.println(numberList.substring(j) + numberList.substring(0, j));
        }


    }
}
