package myPractice.getterSetter;

public class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    private String name = "Dog";

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }

    private int years = 5;
}
