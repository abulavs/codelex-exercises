package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List carsList = Arrays.asList(array);
        System.out.println(carsList);

        //todo - replace array with a HashSet and print out the results
        Set<String> carsSet = new HashSet<>(Arrays.asList(array));
        System.out.println(carsSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> listOfCars = new HashMap<>();
        for (String car : array) {
            if (car.equals("Audi") || car.equals("BMW") || car.equals("Mercedes") || car.equals("VolksWagen"))
                listOfCars.put(car, "Germany");
            else if (car.equals("Honda")) {
                listOfCars.put(car, "Japan");
            } else if (car.equals("Tesla")) {
                listOfCars.put(car, "USA");
            }
        }
        System.out.println(listOfCars);
    }
}
