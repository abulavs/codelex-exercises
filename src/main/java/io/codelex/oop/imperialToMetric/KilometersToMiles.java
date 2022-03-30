package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class KilometersToMiles extends UnitConverter {
    @Override
    public BigDecimal getCoefficent() {
        return new BigDecimal(0.621371192
        );
    }
}
