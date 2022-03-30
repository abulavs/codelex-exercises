package io.codelex.oop.persons;

public class Customer extends Person {
    private String customerId;
    private String purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, String purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPurchaseCount() {
        return purchaseCount;

    }

    public void setPurchaseCount(String value) {
        purchaseCount = value;
    }


    @Override
    String getinfo() {
        return getFirstName() + " " + getLastName() + " " + customerId + " (" + purchaseCount + " purchases)";
    }
}
