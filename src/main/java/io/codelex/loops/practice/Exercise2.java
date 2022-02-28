package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int n = in.nextInt();
        int sum = 1;
        int i;
        for (i = 1; i < n; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
