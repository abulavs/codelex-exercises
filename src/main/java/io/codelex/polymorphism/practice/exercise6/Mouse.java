package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal implements AnimalSound, VegetableInterface {


    public Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("pi pi pi");
    }

    @Override
    public void onlyVegetableFood() {
        System.out.println(" are not eating that type of food!");
    }

}
