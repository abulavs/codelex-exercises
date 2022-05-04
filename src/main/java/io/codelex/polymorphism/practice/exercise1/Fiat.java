package io.codelex.polymorphism.practice.exercise1;

public class Fiat implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed += 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Fffff.....");
    }

    @Override
    public String toString() {
        return "Fiat Speed = " + currentSpeed;
    }
}
