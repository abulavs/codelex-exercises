package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal implements VegetableInterface, AnimalSound {


    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }


    @Override
    public void onlyVegetableFood() {
        System.out.print(" are not eating that type of food!");
    }

    @Override
    public void makeSound() {
        System.out.println("zrrrrrrrrrrrr");
    }
}
