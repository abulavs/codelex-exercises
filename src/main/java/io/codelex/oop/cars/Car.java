package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private ArrayList<Manufacturer> manufacturer = new ArrayList<>();
    private EngineType engineType;


    public Car(String name, String model, int price, int yearOfManufacture, List<Manufacturer> manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer.addAll(manufacturer);
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Car findCar(String carName, String carModel, LinkedList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getName().equals(carName) && cars.get(i).getModel().equals(carModel)) {
                return cars.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture
                && Objects.equals(name, car.name)
                && Objects.equals(model, car.model)
                && Objects.equals(manufacturer, car.manufacturer)
                && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturer, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturer=" + manufacturer +
                ", engineType=" + engineType +
                '}';
    }
}


