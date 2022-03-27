package io.codelex.polymorphism.practice.exercise6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalAPP {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("src/main/java/io/codelex/polymorphism/practice/exercise6/AnimalList.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        List<Food> food = new ArrayList<>();
        List<Animal> animal = new ArrayList<>();

        do {
            String[] arr = reader.readLine().split(" ");
            if (arr[0].equals("End")) {
                System.out.println("End");
                break;
            } else {
                createAnimal(arr, animal);
                System.out.println(animal.get(animal.size() - 1).displayAnimal());
                animal.get(animal.size() - 1).makeSound();

                arr = reader.readLine().split(" ");

                createFood(arr, food);

                System.out.println(food.get(food.size() - 1));

                eatOrNot(animal, food);
            }
        } while (true);
        printAllOut(animal);
    }

    public static void createAnimal(String[] arr, List<Animal> animal) {
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
        }
    }

    public static void createFood(String[] arr, List<Food> food) {
        switch (arr[0]) {
            case "Meat":
                food.add(new Meat(arr[0], Integer.parseInt(arr[1])));
                break;
            case "Vegetable":
                food.add(new Vegetable(arr[0], Integer.parseInt(arr[1])));
                break;
        }
    }

    public static void printAllOut(List<Animal> animal) {
        String result = animal
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static void eatOrNot(List<Animal> animal, List<Food> food) {
        animal.get(animal.size() - 1).eat(food.get(food.size() - 1));
        if ((food.get(food.size() - 1) instanceof Meat) && (animal.get(animal.size() - 1) instanceof Tiger)
                || (animal.get(animal.size() - 1) instanceof Cat)) {
            animal.get(animal.size() - 1).addFoodEaten(food.get(food.size() - 1).quantity);
        } else if (food.get(food.size() - 1) instanceof Vegetable && animal.get(animal.size() - 1) instanceof Mouse ||
                (animal.get(animal.size() - 1) instanceof Zebra)) {
            animal.get(animal.size() - 1).addFoodEaten(food.get(food.size() - 1).quantity);
        }
    }
}





