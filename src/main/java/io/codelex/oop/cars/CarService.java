package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private LinkedList<Car> cars = new LinkedList<>();


    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void printOutAllCars() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

    public List<Car> getEngineType(EngineType engineType) {
        List<Car> carsFound = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getEngineType() == engineType) {
                carsFound.add(cars.get(i));
            }
        }
        return carsFound;
    }

    public void carsBeforeYear(int before) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYearOfManufacture() < before) {
                System.out.println(cars.get(i).getName() + " - " + cars.get(i).getModel());
            }
        }
    }

    public Car mostExpensiveCar() {
        Car carFound = null;
        for (int i = 0; i < cars.size(); i++) {
            if (carFound == null || cars.get(i).getPrice() > carFound.getPrice()) {
                carFound = cars.get(i);
            }
        }
        return carFound;
    }

    public Car cheapestCar() {
        Car carFound = null;
        for (int i = 0; i < cars.size(); i++) {
            if (carFound == null || cars.get(i).getPrice() < carFound.getPrice()) {
                carFound = cars.get(i);
            }
        }
        return carFound;
    }

    public List<Car> carsWithMoreThanOneManufactures(int countOfManufactures) {
        List<Car> carsFound = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManufacturer().size() == countOfManufactures) {
                carsFound.add(cars.get(i));
            }
        }
        return carsFound;
    }

    public List<Car> carsSorted(String order) {
        List<Car> sortedByName = new ArrayList<>();
        if (order.equals("ascending")) {
            sortedByName = cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .collect(Collectors.toList());
        }
        if (order.equals("descending")) {
            sortedByName = cars.stream()
                    .sorted(Comparator.comparing(Car::getName).reversed())
                    .collect(Collectors.toList());
        }
        return sortedByName;
    }

    public Car specificCar(String carName, String carModel) {
        Car carFound = null;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getName().equals(carName) && cars.get(i).getModel().equals(carModel)) {
                carFound = cars.get(i);
            }
        }
        return carFound;
    }

    public List<Car> carsWithSpecificManufacturer(String manufacturerName) {
        List<Car> carsFounds = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.get(i).getManufacturer().size(); j++) {
                if (cars.get(i).getManufacturer().get(j).getName().equals(manufacturerName)) {
                    carsFounds.add(cars.get(i));
                }
            }
        }
        return carsFounds;
    }

    public List<Car> carsListDependsOfManufacturerYear(String operator, int year) {
        List<Car> carsFounds = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.get(i).getManufacturer().size(); j++) {
                switch (operator) {
                    case ">":
                        if (cars.get(i).getManufacturer().get(j).getYearOfEstablishment() > year) {
                            carsFounds.add(cars.get(i));
                        }
                        break;
                    case "<":
                        if (cars.get(i).getManufacturer().get(j).getYearOfEstablishment() < year) {
                            carsFounds.add(cars.get(i));
                        }
                        break;
                    case "<=":
                        if (cars.get(i).getManufacturer().get(j).getYearOfEstablishment() <= year) {
                            carsFounds.add(cars.get(i));
                        }
                        break;
                    case ">=":
                        if (cars.get(i).getManufacturer().get(j).getYearOfEstablishment() >= year) {
                            carsFounds.add(cars.get(i));
                        }
                        break;
                    case "!=":
                        if (cars.get(i).getManufacturer().get(j).getYearOfEstablishment() != year) {
                            carsFounds.add(cars.get(i));
                        }
                        break;
                    case "==":
                        if (cars.get(i).getManufacturer().get(j).getYearOfEstablishment() == year) {
                            carsFounds.add(cars.get(i));
                        }
                        break;
                }
            }
        }
        return carsFounds;
    }

}

