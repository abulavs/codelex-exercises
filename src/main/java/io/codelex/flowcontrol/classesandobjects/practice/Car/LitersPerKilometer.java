package io.codelex.flowcontrol.classesandobjects.practice.Car;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers = 0, liters = 0;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();
        String answer = "";
        System.out.println("Did you refuel? (y/n)");
        answer = scan.next();

        if (answer.equals("y")) {
            System.out.println("Enter odometer reading");
            endKilometers += scan.nextDouble();
            System.out.println("Enter liters?");
            liters += scan.nextDouble();
            while (answer.equals("y")) {
                System.out.println("Did you have another refuel? (y/n)");
                answer = scan.next();
                if (answer.equals("y")) {
                    System.out.println("Enter odometer reading");
                    endKilometers += scan.nextDouble();
                    System.out.println("Enter liters?");
                    liters += scan.nextDouble();
                }

            }
        }

        Car car = new Car(startKilometers);

        car.fillUp(endKilometers, liters);

        System.out.println("Liters per 100 kilometers are " + car.calculateConsumption());
        if (car.gasHog()) {
            System.out.println("Car is a gas hog");
        } else if (car.economyCar()) {
            System.out.println("Car is economy car.");
        }
    }
}
