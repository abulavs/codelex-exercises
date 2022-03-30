package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class CentimetersToInches extends UnitConverter {
    @Override
    public BigDecimal getCoefficent() {
        return new BigDecimal(0.393700787);
    }
}
