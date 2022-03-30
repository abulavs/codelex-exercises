package io.codelex.oop.computers;

public class ComputerApp {
    public static void main(String[] args) {

        Computer computer = new Computer("Dell", "XPS", "Intel i3 3550", 432, "Ge F");
        computer.setCompany("Epson");
        computer.setRam(1);
        computer.setModel("GPPS");
        System.out.println(computer);


        System.out.println("--------------------------------------------");
        Laptop laptop = new Laptop("HP", "Xenon", "AMD X12", 32, "AMD Build-in", "6-cell");
        laptop.setCompany("Epson");
        laptop.setRam(1024);
        laptop.setBattery("Ultra 32 Cell");
        System.out.println(laptop);
    }
}

