package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int[] sampleArray = new int[10];

        Random random = new Random();
        int x = random.nextInt(100);

        for (int i = 0; i < sampleArray.length; i++) {
            sampleArray[i] = random.nextInt(x);
        }
        int[] copyOfsampleArray = sampleArray.clone();
        sampleArray[sampleArray.length - 1] = -7;

        System.out.println("Sample array with changed last value to -7 : " + Arrays.toString(sampleArray));
        System.out.println("Copy of sample array : " + Arrays.toString(copyOfsampleArray));


    }
}
