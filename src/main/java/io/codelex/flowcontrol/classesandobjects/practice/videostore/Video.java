package io.codelex.flowcontrol.classesandobjects.practice.videostore;

public class Video {
    String title;
    boolean checkOutOrNot;
    double averageRating;


    public Video(String title, double averageRating) {
        this.title = title;
        this.averageRating += averageRating;
    }

    public void setCheckOutOrNot(boolean checkOutOrNot) {
        this.checkOutOrNot = checkOutOrNot;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating =(this.averageRating+averageRating)/2;
    }
}
