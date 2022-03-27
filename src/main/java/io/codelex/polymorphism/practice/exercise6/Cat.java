package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime implements AnimalSound {
    String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Mrrrrr Mrrr Mrrr");
    }

    @Override
    public String displayAnimal() {
        String result = super.displayAnimal();
        result += " {" + breed + "}";
        return result;
    }

    @Override
    public String toString() {
        return animalType + " " + animalName + " " + animalWeight + " " + livingRegion + " " + breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }
}
