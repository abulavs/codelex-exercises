package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> nameList = new HashSet<>();
        String in;
        do {
            System.out.print("Enter name : ");
            in = input.nextLine();
            if (in.length() == 0) {
                break;
            } else {
                nameList.add(in);
            }
        } while (true);
        System.out.print("Unique name list contains : ");
        for (String name : nameList) {
            System.out.print(name + " ");
        }
    }
}
