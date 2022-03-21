package io.codelex.oop.shape;

import java.math.BigDecimal;

public class Hexagon extends Shape {
    BigDecimal sideOne;
    BigDecimal sideTwo;
    BigDecimal sideThree;
    BigDecimal sideFour;
    BigDecimal sideFive;
    BigDecimal sideSix;

    public Hexagon(double sideOne, double sideTwo, double sideThree, double sideFour, double sideFive, double sideSix) {
        this.sideOne = new BigDecimal(sideOne);
        this.sideTwo = new BigDecimal(sideTwo);
        this.sideThree = new BigDecimal(sideThree);
        this.sideFour = new BigDecimal(sideFour);
        this.sideFive = new BigDecimal(sideFive);
        this.sideSix = new BigDecimal(sideSix);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return sideOne.multiply(BigDecimal.valueOf(6));
    }

    @Override
    public BigDecimal calculateArea() {
        BigDecimal firstStep = BigDecimal.valueOf(3).multiply(BigDecimal.valueOf(Math.sqrt(3))).divide(BigDecimal.valueOf(2)).multiply(sideOne.multiply(sideOne));
        return firstStep;
    }
}
