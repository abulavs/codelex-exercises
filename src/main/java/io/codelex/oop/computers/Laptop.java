package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private String battery;


    public Laptop(String company, String model, String processor, int ram, String graphicsCard, String battery) {
        super(company, model, processor, ram, graphicsCard);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += ", battery='" + battery + '\'' +
                '}';
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
