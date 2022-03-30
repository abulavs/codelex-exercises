package io.codelex.oop.summary.ordersAndInvoices;

public class Household extends AbstractItem {

    String color;

    public Household(String name, double priceWithoutVAT, String color) {
        super(name, priceWithoutVAT);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "color: " + color;
    }
}
