package io.codelex.java_advanced_test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private volatile List<T> basketItems = new ArrayList<>();


    public void addToBasket(T item) throws BasketFullException {
        if (basketItems.size() > 10) {
            throw new BasketFullException("Basket Full");
        }
        basketItems.add(item);
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basketItems.size() == 0) {
            throw new BasketEmptyException("Basket Empty");
        }
        basketItems.remove(item);
    }
}


