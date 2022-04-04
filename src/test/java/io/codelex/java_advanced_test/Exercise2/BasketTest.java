package io.codelex.java_advanced_test.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void testEmptyBasket() {
        Basket basket = new Basket();
        Exception e = Assertions.assertThrows(BasketEmptyException.class, () -> {
            basket.removeFromBasket(0);
        });
        Assertions.assertEquals("Basket Empty", e.getMessage());
    }

    @Test
    void testAddToMuch() {
        Basket basket = new Basket();
        Exception e = Assertions.assertThrows(Exception.class, () -> {
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
            basket.addToBasket(new Apple());
        });
        System.out.println();
        Assertions.assertEquals("Basket Full", e.getMessage());

    }

}
