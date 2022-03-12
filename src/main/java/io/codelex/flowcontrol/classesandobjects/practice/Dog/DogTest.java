package io.codelex.flowcontrol.classesandobjects.practice.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dog = new Dog[8];
        dog[0] = new Dog("Max", "Male", "Lady", "Rocky");
        dog[1] = new Dog("Rocky", "Male", "Molly", "Sam");
        dog[2] = new Dog("Sparky", "Male");
        dog[3] = new Dog("Buster", "Male", "Lady", "Sparky");
        dog[4] = new Dog("Sam", "Male");
        dog[5] = new Dog("Lady", "female");
        dog[6] = new Dog("Molly", "female");
        dog[7] = new Dog("Coco", "female", "Molly", "Sam");


        System.out.println("------------------------------");
        for (Dog value : dog) {
            value.fathersName();
        }
        System.out.println("------------------------------");

        System.out.println(dog[0].hasSameMotherAs(dog[3]));
        System.out.println(dog[0].hasSameMotherAs(dog[7]));
        System.out.println(dog[1].hasSameMotherAs(dog[7]));
        System.out.println(dog[2].hasSameMotherAs(dog[4]));

    }
}

