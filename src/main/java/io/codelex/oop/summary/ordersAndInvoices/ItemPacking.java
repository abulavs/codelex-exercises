package io.codelex.oop.summary.ordersAndInvoices;

public class ItemPacking implements Service {
    static final String name = "Item packing";
    static final double price = 5;


    public String getName() {
        return name;
    }


    public double getPriceWithoutVAT() {
        return price;
    }


    public String fullInfo() {
        return name + ", " + price + " EUR";
    }
}
