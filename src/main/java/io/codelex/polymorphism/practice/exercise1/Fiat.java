package io.codelex.polymorphism.practice.exercise1;

public class Fiat implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 15;
    }

    public void slowDown() {
        currentSpeed += 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }


    public void startEngine() {
        System.out.println("Fffff.....");
    }

    @Override
    public String toString() {
        return "Fiat Speed = " + currentSpeed;
    }
}
