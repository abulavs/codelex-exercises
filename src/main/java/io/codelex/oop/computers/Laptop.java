package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    String battery;


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
        return "Laptop{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", battery='" + battery + '\'' +
                '}';
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
