package myPractice.getterSetter;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Author {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    ArrayList<String> booksList = new ArrayList<String>();
    static int BOOKS_IN_THE_WORLD = 129864880;

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void addBook(String book) {
        booksList.add(book);
    }

    public long getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public boolean hasWrittenBook(String name) {
        for (String b : booksList) {
            if (b.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void printAllInfo() {
        System.out.println(getFullName());
        System.out.println("His age is " + getAge() + " at the moment");
        System.out.println("He has written " + booksList.size() + " books");
    }

}
