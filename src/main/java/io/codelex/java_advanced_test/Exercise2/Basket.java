package io.codelex.java_advanced_test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> basketItems = new ArrayList<>();


    public void addToBasket(T item) {
        try {
            basketItems.add(item);
            if (basketItems.size() == 10) {
                throw new BasketFullException("Basket Full");
            }
        } catch (BasketFullException e) {
            System.out.println(e);
        }
    }

    public void removeFromBasket(T item) {
        try {
            basketItems.remove(item);
            if (basketItems.size() == 0) {
                throw new BasketEmptyException("Basket Empty");
            }
        } catch (BasketEmptyException e) {
            System.out.println(e);
        }
    }
}


