package io.codelex.java_advanced_test.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void testEmptyBasket() {
        Basket<Integer> basket = new Basket<Integer>();
        Exception e = Assertions.assertThrows(BasketFullException.class, () -> basket.removeFromBasket(0));
        Assertions.assertEquals("Basket Empty", e.getMessage());
    }

    @Test
    void testAddToMuch() {
        Basket<Object> basket = new Basket<>();
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        Exception e = Assertions.assertThrows(BasketFullException.class, () -> basket.addToBasket(new Apple()));
        Assertions.assertEquals("Basket Full", e.getMessage());

    }

}
