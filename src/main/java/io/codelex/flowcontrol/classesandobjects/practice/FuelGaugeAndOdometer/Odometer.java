package io.codelex.flowcontrol.classesandobjects.practice.FuelGaugeAndOdometer;

public class Odometer {
    int currentMileage;

    public int getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(int currentMileage) {
        this.currentMileage = currentMileage;
    }

    int mileageAdd(int value) {
        return currentMileage = currentMileage + value;

    }
}



