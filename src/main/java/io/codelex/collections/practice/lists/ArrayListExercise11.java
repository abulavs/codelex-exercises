package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> myList = new ArrayList<>();

        //TODO: Add 10 values to list
        myList.add("car");
        myList.add("vat");
        myList.add("euro");
        myList.add("rub");
        myList.add("one");
        myList.add("sky");
        myList.add("plane");
        myList.add("truck");
        myList.add("cpu");
        myList.add("wall");

        //TODO: Add new value at 5th position
        myList.add(4, "ball");
        //TODO: Change value at last position (Calculate last position programmatically)
        myList.set(myList.size() - 1, "rabbit");
        //TODO: Sort your list in alphabetical order
        myList.sort(String.CASE_INSENSITIVE_ORDER);
        //TODO: Check if your list contains "Foobar" element
        System.out.println(myList.contains("Foobar"));
        //TODO: Print each element of list using loop
        for (String el : myList) {
            System.out.println(el);
        }
    }

}
