package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class KilometersToMiles extends UnitConverter {
    @Override
    protected BigDecimal getCoefficent() {
        return new BigDecimal(0.621371192
        );
    }
}
