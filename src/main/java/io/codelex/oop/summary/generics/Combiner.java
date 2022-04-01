package io.codelex.oop.summary.generics;

public class Combiner {
    public static void main(String[] args) {
        System.out.println(combineTwoItems(5, 10));
    }
    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public static <T> String combineTwoItems(T first, T second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

}
