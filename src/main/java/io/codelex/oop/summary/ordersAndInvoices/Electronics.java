package io.codelex.oop.summary.ordersAndInvoices;

public class Electronics extends AbstractItem {
    int powerWatts;

    public Electronics(String name, double priceWithoutVAT, int powerWatts) {
        super(name, priceWithoutVAT);
        this.powerWatts = powerWatts;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "power: " + powerWatts;
    }
}
