package io.codelex.oop.summary.ordersAndInvoices;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<AbstractItem> item = new ArrayList<>();
        item.add(new Food("Orange", 12.99, "2022-03-31"));
        item.add(new Electronics("Fridge", 300, 2000));
        item.add(new Household("Table", 99.99, "Black"));

        Order order = new Order();
        // order.addItemList(item.get(0));
        // order.addItemList(item.get(1));
        // order.addItemList(item.get(2));
        try {
            Invoice invoice = new Invoice(order.orderList(), "AA102654");

            if (order.orderList().size() == 0) {
                throw new WrongOrderException();
            }
            order.printOutOrder(invoice);
        } catch (WrongOrderException e) {
            System.out.println("Empty order!");
        }


    }
}
