package io.codelex.oop.parcels;

public class ParcelApp {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(30, 50, 70, 30, false);
        parcel.validate();

        Parcel parcel2 = new Parcel(100, 101, 100, 29, true);
        parcel2.validate();

        Parcel parcel3 = new Parcel(20, 50, 70, 29, false);
        parcel3.validate();

        Parcel parcel4 = new Parcel(30, 50, 70, 16, true);
        parcel4.validate();


    }
}
