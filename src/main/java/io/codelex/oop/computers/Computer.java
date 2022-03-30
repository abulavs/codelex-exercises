package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {
    private String company;
    private String model;
    private String processor;
    private int ram;
    private String graphicsCard;

    public Computer(String company, String model, String processor, int ram, String graphicsCard) {
        this.company = company;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void printFormated() {
        System.out.println(company + " " + model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(company, computer.company) && Objects.equals(model, computer.model) && Objects.equals(processor, computer.processor) && Objects.equals(graphicsCard, computer.graphicsCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, processor, ram, graphicsCard);
    }
}
