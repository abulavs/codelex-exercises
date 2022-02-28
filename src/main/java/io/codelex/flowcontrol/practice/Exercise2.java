package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int[] inputArray = {num1, num2, num3};
        int largestNumber = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > largestNumber) {
                largestNumber = inputArray[i];
            }
        }

        System.out.println("Largest Number is: " + largestNumber);
    }
}
