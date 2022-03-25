package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi());
        cars.add(new Bmw());
        cars.add(new Lexus());
        cars.add(new Tesla());
        cars.add(new Zaz());
        cars.add(new Fiat());

        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3 && cars.get(i) instanceof CarBoost boost) {
                    boost.useNitrousOxideEngine();
                } else {
                    cars.get(i).speedUp();
                }
            }

        }
        int maxSpeed = 0;
        String fastesCar = "";
        for (int i = 0; i < cars.size(); i++) {
            if (maxSpeed < Integer.parseInt(cars.get(i).showCurrentSpeed())) {
                maxSpeed = Integer.parseInt(cars.get(i).showCurrentSpeed());
                fastesCar = String.valueOf(cars.get(i));
            }
        }
        System.out.println("Fastest Car is:");
        System.out.println(fastesCar);



/*
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        for
        for (int i = 0; i < 10; i++) {
           if () {
                lexus.useNitrousOxideEngine();
            }else{
            audi.speedUp();
            bmw.speedUp();
            lexus.speedUp();
            tesla.speedUp();
        }
        System.out.println(audi.showCurrentSpeed());
        System.out.println(bmw.showCurrentSpeed());
        System.out.println(lexus.showCurrentSpeed());
        System.out.println(tesla.showCurrentSpeed());
    }*/


    }
}
