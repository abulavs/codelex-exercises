package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;

public class Food extends AbstractItem {
    private LocalDate expirationDate;

    public Food(String name, double priceWithoutVAT, String expirationDate) {
        super(name, priceWithoutVAT);
        this.expirationDate = LocalDate.parse(expirationDate);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "best before: " + expirationDate;
    }
}
