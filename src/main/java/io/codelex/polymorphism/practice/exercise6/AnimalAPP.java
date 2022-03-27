package io.codelex.polymorphism.practice.exercise6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AnimalAPP {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("src/main/java/io/codelex/polymorphism/practice/exercise6/AnimalList.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Food> food = new ArrayList<>();
        List<Animal> animal = new ArrayList<>();

        boolean isEnd = true;
        do {
            String[] arr = reader.readLine().split(" ");
            switch (arr[0]) {
                case "Cat":
                    animal.add(new Cat(arr[0], arr[1], Integer.parseInt(arr[2]), 0, arr[3], arr[4]));
                    break;
                case "Tiger":
                    animal.add(new Tiger(arr[0], arr[1], Integer.parseInt(arr[2]), 0, arr[3]));
                    break;
                case "Mouse":
                    animal.add(new Mouse(arr[0], arr[1], Integer.parseInt(arr[2]), 0, arr[3]));
                    break;
                case "Zebra":
                    animal.add(new Zebra(arr[0], arr[1], Integer.parseInt(arr[2]), 0, arr[3]));
                    break;
                case "End":
                    System.out.println("End");
                    isEnd = false;
                    break;
            }
            System.out.println(animal.get(animal.size() - 1));
            animal.get(animal.size() - 1).makeSound();

            String[] arr2 = reader.readLine().split(" ");
            switch (arr2[0]) {
                case "Meat":
                    food.add(new Meat(arr2[0], Integer.parseInt(arr2[1])));
                    break;
                case "Vegetable":
                    food.add(new Vegetable(arr2[0], Integer.parseInt(arr2[1])));
                    break;
            }
            System.out.println(food.get(food.size() - 1));
            animal.get(animal.size() - 1).foodEaten += food.get(food.size() - 1).quantity;
            System.out.println(animal.get(animal.size() - 1));
        } while (isEnd);


    }
}





