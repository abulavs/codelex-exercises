package io.codelex.flowcontrol.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;
    static final double energyDrinkers = NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
    static final double preferCitrus = NUMBERED_SURVEYED * PREFER_CITRUS_DRINKS;

    public static void main(String[] args) {
        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + (int)energyDrinkers + " bought at least one energy drink");
        System.out.println((int)preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }
}


