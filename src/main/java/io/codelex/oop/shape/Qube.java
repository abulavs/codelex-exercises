package io.codelex.oop.shape;

import java.math.BigDecimal;

public class Qube extends ThreeDShape {
    BigDecimal length;
    BigDecimal width;
    BigDecimal heightOrDepth;

    public Qube(double length, double width, double heightOrDepth) {
        this.length = new BigDecimal(length);
        this.width = new BigDecimal(width);
        this.heightOrDepth = new BigDecimal(heightOrDepth);
    }

    @Override
    public BigDecimal calculateVolume() {
        return length.add(width).add(heightOrDepth).pow(3);
    }
}
