package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Exercise6 {
    public static void main(String[] args) {
        int[] myArray1 = new int[10];

        Random random = new Random();
        int x = random.nextInt(99);

        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = random.nextInt(x);
        }
        int[] myArray2 = myArray1.clone();
        myArray1[myArray1.length - 1] = -7;

        System.out.println("My Array 1 : "+Arrays.toString(myArray1));
        System.out.println("My Array 2 : "+Arrays.toString(myArray2));


    }
}
