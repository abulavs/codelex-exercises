package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime implements AnimalSound {


    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("hrrrrrrrrrrrrrrrrrrr  rr rr");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                ", livingRegion='" + livingRegion + '\'' +
                '}';
    }
}
