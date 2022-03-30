package io.codelex.oop.persons;

public class MainProgram {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", "123456", 45, "Pilot", "2007-12-03");
        System.out.println("First Name : " + employee.getFirstName());
        System.out.println("Last Name : " + employee.getLastName());
        System.out.println("ID : " + employee.getId());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Position : " + employee.getPosition());
        System.out.println("Started working : " + employee.getStartedWorking());
        System.out.println("Work experience : " + employee.getWorkExperience());
        System.out.println("Info : " + employee.getinfo());
        System.out.println("--------------------------------------------------------");

        Customer customer = new Customer("Piter", "Tower", "945956649", 99, "LZP45213F", "3");
        System.out.println("First Name : " + customer.getFirstName());
        System.out.println("Last Name : " + customer.getLastName());
        System.out.println("ID : " + customer.getId());
        System.out.println("Age : " + customer.getAge());
        System.out.println("Customer ID : " + customer.getCustomerId());
        System.out.println("Purchase Count : " + customer.getPurchaseCount());
        System.out.println("##############################################");
        // Set Purchase Count to 50
        customer.setPurchaseCount("50");
        System.out.println("Purchase Count : " + customer.getPurchaseCount());
        System.out.println("##############################################");
        System.out.println("Info : " + customer.getinfo());
    }
}
