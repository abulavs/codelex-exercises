package io.codelex.classesandobjects.practice.Car;

import java.util.Scanner;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    void fillUp(double mileage, double liters) {
        this.endKilometers += mileage;
        this.liters += liters;
    }

    double calculateConsumption() {
        return Math.round((liters / (endKilometers - startKilometers)) * 100);
    }

    boolean gasHog() {
        return calculateConsumption() > 15;
    }

    boolean economyCar() {
        return calculateConsumption() < 5;
    }
}

