package io.codelex.java_advanced_test.Exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Program<T> {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);


        System.out.println(percent);


        Function<String, Integer> len = String::length;
        UnaryOperator<Integer> bigger = (Integer i) -> i.compareTo(4);
//    List<String> result
    }
}


