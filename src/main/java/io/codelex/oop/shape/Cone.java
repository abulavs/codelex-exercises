package io.codelex.oop.shape;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Cone extends ThreeDShape {
    BigDecimal height;
    BigDecimal baseRadius;

    public Cone(double height, double baseWidth) {
        this.height = new BigDecimal(height);
        this.baseRadius = new BigDecimal(baseWidth / 2);
    }

    @Override
    public BigDecimal calculateVolume() {
        return BigDecimal.valueOf(1 / 3f).multiply(BigDecimal.valueOf(Math.PI)).multiply(height).multiply(baseRadius.pow(2)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal calculateArea() {
        MathContext mc = new MathContext(5);
        BigDecimal baseArea = BigDecimal.valueOf(Math.PI).multiply(baseRadius.pow(2));
        BigDecimal sideAreaRadiusCalculation = baseRadius.pow(2).add(height.pow(2));
        BigDecimal sideAreaRadius = sideAreaRadiusCalculation.sqrt(mc);
        BigDecimal sideArea = BigDecimal.valueOf(Math.PI).multiply(baseRadius).multiply(sideAreaRadius);

        return baseArea.add(sideArea).setScale(2, RoundingMode.HALF_UP);
    }
}
