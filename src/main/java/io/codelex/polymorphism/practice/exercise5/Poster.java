package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int posterDiagonal_cm;
    private int numberOfCopies;
    private int costPerCopy;


    public Poster(int fee, int dimensions, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.posterDiagonal_cm = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return fee + costPerCopy * numberOfCopies * posterDiagonal_cm / 3;
    }


    public String toString() {
        return super.toString()
                + " Poster ad: diagonal_cm=" + posterDiagonal_cm
                + " number_of_copies=" + numberOfCopies
                + " rate=" + costPerCopy;
    }


}
