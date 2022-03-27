package io.codelex.polymorphism.practice.exercise6;

abstract class Food {
    Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Food{" +
                "quantity=" + quantity +
                '}';
    }
}
