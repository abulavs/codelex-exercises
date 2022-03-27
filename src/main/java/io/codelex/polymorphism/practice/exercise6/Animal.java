package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalType, String animalName, double animalWeight, int foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public String displayAnimal() {
        return animalType + " " + animalName + " " + animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void addFoodEaten(int foodEaten) {
        this.foodEaten += foodEaten;
    }

    void eat(Food food) {
        System.out.print("> ");
    }

    void makeSound() {
        System.out.print("> ");
    }
}
