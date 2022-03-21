package io.codelex.oop.shape;

import java.math.BigDecimal;

public class Cone extends ThreeDShape {
    BigDecimal height;
    BigDecimal baseRadius;
    BigDecimal topRadius;

    public Cone(double height, double baseRadius, double topRadius) {
        this.height = new BigDecimal(height);
        this.baseRadius = new BigDecimal(baseRadius);
        this.topRadius = new BigDecimal(topRadius);
    }

    @Override
    public BigDecimal calculateVolume() {
        BigDecimal firstPart = BigDecimal.valueOf(1 / 3f).multiply(BigDecimal.valueOf(Math.PI)).multiply(height);
        BigDecimal secondPart = (baseRadius.multiply(baseRadius)).add(baseRadius.multiply(topRadius).add(topRadius.multiply(topRadius)));
        return firstPart.multiply(secondPart);
    }
}
