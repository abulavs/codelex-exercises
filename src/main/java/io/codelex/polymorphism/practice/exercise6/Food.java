package io.codelex.polymorphism.practice.exercise6;

abstract class Food {
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Food(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return null;
    }
}
