package io.codelex.collections.practice.phonebook;


public class PhoneDirectory {
    PhoneEntry phoneEntry = new PhoneEntry();

    public String getNumber(String name) {
        String key = phoneEntry.getPhoneBookList(name);
        return key;
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        phoneEntry.addPhoneBookList(name, number);
    }
}
