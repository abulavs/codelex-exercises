package io.codelex.oop.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qube extends ThreeDShape {
    BigDecimal side;

    public Qube(double side) {
        this.side = new BigDecimal(side);

    }

    @Override
    public BigDecimal calculateVolume() {
        return side.pow(3);
    }

    @Override
    public BigDecimal calculateArea() {
        return side.pow(2).multiply(BigDecimal.valueOf(6)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return side.multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.HALF_UP);
    }
}