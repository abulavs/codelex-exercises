package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getStartedWorking() {
        return startedWorking;
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking.getYear();
    }

    @Override
    String getinfo() {
        return getFirstName() + " " + getLastName() + " " + position + " (" + getWorkExperience() + " years)";
    }
}
