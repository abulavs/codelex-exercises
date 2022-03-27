package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    void addSales(double value) {
        totalSales = value;
    }

    @Override
    public double pay() {
        double result = super.pay();
        result += totalSales * commissionRate;
        totalSales = 0;
        return result;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
}
