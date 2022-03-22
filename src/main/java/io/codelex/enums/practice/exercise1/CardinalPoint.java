package io.codelex.enums.practice.exercise1;

import java.util.Formatter;

public enum CardinalPoint {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    final String direction;

    CardinalPoint(String direction) {
        this.direction = direction;
    }


    public void printFormatedEnum() {
        Formatter formatter = new Formatter();
        System.out.println("---------------------------------------");
        formatter.format("|%11s %5s %10s %8s\n", "Direction", "|", "Text", "|");
        formatter.format("---------------------------------------\n");
        for (CardinalPoint point : CardinalPoint.values()) {
            formatter.format("|%11s %5s %10s %8s\n", point, "|", point.direction, "|");
        }
        formatter.format("---------------------------------------");
        System.out.println(formatter);
    }


    public void printOutAllEnum() {
        int count = 0;
        for (CardinalPoint point : CardinalPoint.values()) {
            System.out.println(point + ":" + point.direction + ":" + count);
            count++;
        }
    }
}
