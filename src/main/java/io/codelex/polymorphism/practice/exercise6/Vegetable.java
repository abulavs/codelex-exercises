package io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food {

    String vegetableName;

    public Vegetable(String vegetableName, Integer quantity) {
        super(quantity);
        this.vegetableName = vegetableName;
    }

    @Override
    public String toString() {
        return vegetableName + " " + getQuantity();
    }
}
