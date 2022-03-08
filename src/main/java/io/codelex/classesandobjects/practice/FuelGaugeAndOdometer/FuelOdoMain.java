package io.codelex.classesandobjects.practice.FuelGaugeAndOdometer;

public class FuelOdoMain {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer();

        int fuelBurnMark = 0;

        fuelGauge.fillUp(70);
        while (odometer.getCurrentMileage() < 999999) {
            odometer.mileageAdd(1);
            System.out.println("Mileage : " + odometer.getCurrentMileage());
            if (odometer.getCurrentMileage() == fuelBurnMark + 10) {
                fuelGauge.fuelBurn(1);
                System.out.println("Fuel left : " + fuelGauge.getCurrentFuel());
                fuelBurnMark += 10;
            }
            if (odometer.getCurrentMileage() == 999999) {
                odometer.setCurrentMileage(0);
                fuelBurnMark = 0;
            }
            if (fuelGauge.getCurrentFuel() == 0) {
                System.out.println("Out of Fuel");
                break;
            }
        }
    }
}

