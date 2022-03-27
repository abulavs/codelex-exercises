package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("hrrrrrrrrrrrrrrrrrrr  rr rr");
    }

    @Override
    void eat(Food food) {
        if (!(food instanceof Meat)) {
            super.eat(food);
            System.out.println(getAnimalType() + " are not eating that type of food!");
        }
    }
}
