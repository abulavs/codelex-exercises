package io.codelex.oop.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon extends Shape {
    BigDecimal side;


    public Hexagon(double side) {
        this.side = new BigDecimal(side);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(BigDecimal.valueOf(6));
    }

    @Override
    public BigDecimal calculateArea() {
        return BigDecimal.valueOf(3).multiply(BigDecimal.valueOf(Math.sqrt(3))).divide(BigDecimal.valueOf(2)).multiply(side.multiply(side)).setScale(2, RoundingMode.HALF_UP);
    }
}
