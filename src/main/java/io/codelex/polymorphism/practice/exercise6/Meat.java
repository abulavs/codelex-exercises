package io.codelex.polymorphism.practice.exercise6;

public class Meat extends Food {
    private String meatName;

    public Meat(String meatName, Integer quantity) {
        super(quantity);
        this.meatName = meatName;
    }

    @Override
    public String toString() {
        return meatName + " " + getQuantity();

    }
}
