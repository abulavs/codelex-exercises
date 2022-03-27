package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Mjauuuu");
    }

    @Override
    public String displayAnimal() {
        String result = super.displayAnimal();
        result += " " + breed;
        return result;
    }

    @Override
    public String toString() {
        return getAnimalType() + "[" + getAnimalName() + ", " + breed + ", " + getAnimalWeight() + ", " + livingRegion + ", " + getFoodEaten() + "]";
    }
}
