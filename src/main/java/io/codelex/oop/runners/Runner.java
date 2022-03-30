package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(9, 15),
    INTERMEDIATE(7, 9),
    ADVANCED(5, 7);


    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }


    public static Runner getFitnessLevel(int time) {
        if (time > BEGINNER.minTime) {
            return BEGINNER;
        } else if (time > INTERMEDIATE.minTime && time < INTERMEDIATE.maxTime) {
            return INTERMEDIATE;
        } else if (time < ADVANCED.maxTime) {
            return ADVANCED;
        }
        return null;
    }
}
