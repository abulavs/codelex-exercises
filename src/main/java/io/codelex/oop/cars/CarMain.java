package io.codelex.oop.cars;

import java.util.Arrays;

import static io.codelex.oop.cars.EngineType.*;

public class CarMain extends CarService {
    public static void main(String[] args) {

        Manufacturer audi = new Manufacturer("Audi Motors", 1700, "Germany");
        Manufacturer mazda = new Manufacturer("Mazda Motors", 1560, "Spain");
        Manufacturer lancia = new Manufacturer("Lancia Motors", 1420, "Italy");
        Manufacturer dacia = new Manufacturer("Dacia Pro", 2021, "Bermuda");
        Manufacturer fiat = new Manufacturer("Fiat ltd", 1500, "Italy");
        Manufacturer volvo = new Manufacturer("Volvo Motors", 1100, "Sweden");

        CarService carService = new CarService();
        carService.addCar(new Car("Fiat", "Punto", 3000, 2020, Arrays.asList(audi, lancia), V12));
        carService.addCar(new Car("Mazda", "323", 2000, 1991, Arrays.asList(audi, mazda, lancia), V6));
        carService.addCar(new Car("Lancia", "Delta", 7000, 1985, Arrays.asList(audi, lancia), S4));
        carService.addCar(new Car("Dacia", "Duster", 11500, 2021, Arrays.asList(dacia, mazda), V6));
        carService.addCar(new Car("VAZ", "Lada", 500, 1983, Arrays.asList(fiat, lancia), S6));
        carService.addCar(new Car("Fiat", "126", 1100, 1995, Arrays.asList(fiat, lancia), V12));
        carService.addCar(new Car("Subaru", "Forester", 4500, 2010, Arrays.asList(mazda, dacia), V8));
        carService.addCar(new Car("Volvo", "V450", 1500, 2005, Arrays.asList(volvo, lancia), V12));
        carService.printOutAllCars();
        System.out.println("------------------------------------------");
        carService.removeCar(new Car("Volvo", "V450", 1500, 2005, Arrays.asList(volvo, lancia), V12));

        carService.printOutAllCars(); //returning a list of all cars
        carService.getEngineType(V12); //returning cars with a V12 engine
        carService.carsBeforeYear(1999); //returning cars produced before 1999,
        System.out.println(carService.mostExpensiveCar()); //returning the most expensive car
        System.out.println(carService.cheapestCar()); //returning the cheapest car
        System.out.println(carService.carsWithMoreThanOneManufactures(3)); //returning the car with at least 3 manufacturers
        System.out.println(carService.carsSorted("ascending")); //sort
        System.out.println(carService.carsSorted("descending")); //sort
        System.out.println(carService.specificCar("Lancia", "Delta")); //checking if a specific car is on the list
        System.out.println(carService.carsWithSpecificManufacturer("Mazda Motors")); //returning a list of cars manufactured by a specific manufacturer
        System.out.println(carService.carsListDependsOfManufacturerYear("!=", 1100)); //returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given
    }
}
