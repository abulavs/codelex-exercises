package io.codelex.polymorphism.practice.exercise1;

public class Zaz implements Car, CarBoost {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 4;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 70;
    }

    public void startEngine() {
        System.out.println("Zrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Zaz Speed = " + currentSpeed;
    }
}


