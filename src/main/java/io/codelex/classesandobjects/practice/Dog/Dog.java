package io.codelex.classesandobjects.practice.Dog;

import java.util.Objects;

public class Dog<a> {
    String name;
    String sex;
    String mother;
    String father;

    public String getName(String dog1) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMother(String dog1) {
        return mother;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public void fathersName() {
        if (father == null) {
            System.out.println("Father is : Unknown");
        } else {
            System.out.println("Father is : " + father);
        }
    }


    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother != null && Objects.equals(mother, otherDog.mother)) {
            return true;
        }
        return false;
    }
//public void hasSameMotherAs(String dog1, String dog2){
    //      if(getMother(dog1).equals(getMother(dog2))&&getMother(dog1)!=null&&getMother(dog2)!=null){
    //         if(!(getName(dog1).equals(getName(dog2)))){
    //             return true;
    //          }
    //     }


}
