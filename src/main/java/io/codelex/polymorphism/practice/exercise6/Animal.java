package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal implements AnimalSound {
    String animalName;
    String animalType;
    double animalWeight;
    int foodEaten;

    public Animal() {

    }


    public Animal(String animalType, String animalName, double animalWeight, int foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String displayAnimal() {
        return "{" + animalType + "} {" + animalName + "} {" + animalWeight + "}";
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
