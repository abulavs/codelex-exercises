package io.codelex.multithreading.simplified;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class NumberOperations {

    /*
    Given the list of numbers calculate and print out:
    sum of numbers
    average value of numbers
    sum of each second number

    All operations must be done in parallel
    */
    // int sumOfNumbers = 0;


    public static void main(String[] args) throws InterruptedException {
        List<Integer> numberList = createNumberList();


        Runnable sumOfNumbers = () -> {
            System.out.println("Sum of all :" + numberList.stream().mapToInt(n -> n).sum());
        };
        Runnable averageOfNumbers = () -> {
            System.out.println("Average :" + numberList.stream().mapToInt(n -> n).average().getAsDouble());
        };
        Runnable sumOfEachSecond = () -> {
            List<Integer> temp;
            int[] n = {0};
            temp = (numberList.stream().filter(x -> n[0]++ % 2 == 0).collect(Collectors.toList()));
            System.out.println("Sum of every Second :" + temp.stream().mapToInt(c -> c).sum());
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(sumOfNumbers);
        executor.execute(averageOfNumbers);
        executor.execute(sumOfEachSecond);
        executor.shutdown();

    }
    
    public static List<Integer> createNumberList() {
        return Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37,
                39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81,
                83, 85, 87, 89, 91, 93, 95, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 117, 119,
                121, 123, 125, 127, 129, 131, 133, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153,
                155, 157, 159, 161, 163, 165, 167, 169, 171, 173, 175, 177, 179, 181, 183, 185, 187,
                189, 191, 193, 195, 197, 199);
    }

}
