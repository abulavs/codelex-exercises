package io.codelex.oop.shape;

import java.math.BigDecimal;

public class Rectangle extends Shape {
    BigDecimal sideOne;
    BigDecimal sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = new BigDecimal(sideOne);
        this.sideTwo = new BigDecimal(sideTwo);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return sideOne.add(sideTwo).multiply(BigDecimal.valueOf(2));
    }

    @Override
    public BigDecimal calculateArea() {
        return sideOne.multiply(sideTwo);
    }
}
