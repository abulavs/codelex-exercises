package io.codelex.oop.summary.generics;

public class Printer<T> {
    public static void main(String[] args) {
        Printer printer = new Printer(333.3444f);
        printer.print();
    }

    //Fix this class so that any object, not only BigDecimal can be printed
    //Test the functionality

    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }
}
