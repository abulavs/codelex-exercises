package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    String livingRegion;

    public Mammal() {
    }

    public Mammal(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    public String displayAnimal() {
        String result = super.displayAnimal();
        result += " {" + livingRegion + "}";
        return result;
    }
}
