package io.codelex.oop.summary.ordersAndInvoices;

public class AbstractItem implements Item {
    private String name;
    private double priceWithoutVAT;

    public AbstractItem(String name, double priceWithoutVAT) {
        this.name = name;
        this.priceWithoutVAT = priceWithoutVAT;
    }

    public String getName() {
        return name;
    }

    public double getPriceWithoutVAT() {
        return priceWithoutVAT;
    }

    public String fullInfo() {
        return name + ", " + priceWithoutVAT + "EUR, ";
    }


}
