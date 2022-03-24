package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneEntry {
    private TreeMap<String, String> phoneBookList = new TreeMap<>();

    public String getPhoneBookList(String name) {
        return phoneBookList.get(name);
    }

    public void addPhoneBookList(String name, String number) {
        this.phoneBookList.put(name, number);
    }
}
