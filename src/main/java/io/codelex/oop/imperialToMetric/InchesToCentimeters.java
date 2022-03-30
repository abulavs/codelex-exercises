package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class InchesToCentimeters extends UnitConverter {
    @Override
    public BigDecimal getCoefficent() {
        return new BigDecimal(2.54);
    }
}
