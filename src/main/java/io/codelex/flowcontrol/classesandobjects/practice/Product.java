package io.codelex.flowcontrol.classesandobjects.practice;

public class Product {
    String name;
    double priceAtStart;
    int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    public void printProduct(String name, double priceAtStart, int amountAtStart) {
        System.out.print("<>  ");
        System.out.println(name + " " + priceAtStart + "EUR " + amountAtStart+" units");
    }

    public static void main(String[] args) {

        Product one = new Product("Logitech mouse", 70.00, 14);
        one.printProduct(one.getName(), one.getPriceAtStart(), one.getAmountAtStart());

        Product two = new Product("iPhone 5s", 999.99, 3);
        two.printProduct(two.getName(), two.getPriceAtStart(), two.getAmountAtStart());

        Product three = new Product("Epson EB-U05", 440.46, 1);
        three.printProduct(three.getName(), three.getPriceAtStart(), three.getAmountAtStart());

        Product four = new Product("Samsung", 0.99, 500);
        four.printProduct(four.getName(), four.getPriceAtStart(), four.getAmountAtStart());
        System.out.println("--------------------------------------------------------------");
        four.setPriceAtStart(199);
        four.setAmountAtStart(6);
        four.printProduct(four.getName(), four.getPriceAtStart(), four.getAmountAtStart());
    }

}
