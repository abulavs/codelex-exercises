package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300 || xLength > 30 && yLength > 30 && zLength > 30) {
            System.out.println("Dimensions exceed 300 or size less than 30");
        } else {
            if (!isExpress) {
                if (weight <= 30) {
                    System.out.println("Ready to dispatch");
                    return true;
                } else {
                    System.out.println("Too heavy (max weight 30)");
                }
            } else if (isExpress) {
                if (weight <= 15) {
                    return true;
                } else {
                    System.out.println("Too heavy for express ((max weight 15)");
                }
            }
        }

        return false;
    }
}
