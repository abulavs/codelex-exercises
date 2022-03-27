package io.codelex.polymorphism.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class PersonAPP {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Random", "Person", "Adress", 21));
        persons.add(new Student("John", "Doe", "Sun street 5", 2, 7.5));
        persons.add(new Employee("Samanta", "Lavigne", "Green street 3", 9, "Boss"));

        persons.stream().forEach(Person::display);


    }
}
