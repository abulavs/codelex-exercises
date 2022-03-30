package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private List<AbstractItem> orderList = new ArrayList<>();

    public List<AbstractItem> orderList() {
        return orderList;
    }


    public void addItemList(AbstractItem item) {
        try {
            this.orderList.add(item);
            if (item instanceof Food) {
                if (Objects.equals(((Food) item).getExpirationDate(), LocalDate.now())) {
                    throw new BadFoodException();
                }
            }
        } catch (BadFoodException e) {
            System.out.println("Bad food!");
        }

    }

    public void printOutOrder(Invoice invoice) {
        String verticalWallSymbol = "=";
        int count = 1;
        System.out.println(invoice.getInvoiceDate());
        for (AbstractItem i : orderList) {
            System.out.printf("%-1s %-47s %1s %n", "=", count + ". " + i.fullInfo(), "=");
            count++;
        }
        System.out.printf("%-1s %-47s %1s %n", verticalWallSymbol, "SUM: " + invoice.getOrderSum() + " EUR", verticalWallSymbol);
        System.out.printf("%-1s %-47s %1s %n", verticalWallSymbol, "VAT (21%): " + (invoice.getOrderSum() * 0.21) + " EUR", verticalWallSymbol);
        System.out.printf("%-1s %-47s %1s %n", verticalWallSymbol, "TOTAL: " + invoice.getOrderSum() * 1.21 + " EUR", verticalWallSymbol);
        System.out.println("===================================================");
    }
}
