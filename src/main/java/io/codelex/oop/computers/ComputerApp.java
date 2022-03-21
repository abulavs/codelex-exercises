package io.codelex.oop.computers;

import java.util.ArrayList;

public class ComputerApp {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", "XPS", "Intel i3 3550", 4, "Intel HD"));
        computers.add(new Computer("Dell", "XPS", "Intel i3 3550", 4, "Intel HD"));
        computers.add(new Computer("Dell", "XPL", "Intel i5 3550", 16, "Force X"));
        computers.add(new Computer("Dell", "XPS", "Intel i3 3550", 432, "Ge F"));


        for (int i = 0; i < computers.size(); i++) {
            for (int j = 1; j < computers.size(); j++) {
                if (computers.get(i).equals(computers.get(j))) {
                    System.out.println(computers.get(i));
                }
            }
        }


        //    System.out.println(computer.equals(computer2)); //expected true
        //    System.out.println(computer.getModel().equals(computer3.getModel())); //expected false


        //    System.out.println(computer);
        System.out.println("--------------------------------------------");
        Laptop laptop = new Laptop("HP", "Xenon", "AMD X12", 32, "AMD Build-in", "6-cell");
        System.out.println(laptop);

    }
}

