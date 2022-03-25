package myPractice.getterSetter;

import myPractice.getterSetter.CommonWorkClasses.MyAdvancedFunction;

public class Lambda {
    public static void main(String[] args) {
        MyAdvancedFunction<Integer> myFunction = (Integer number) -> number * 2;
        System.out.println(myFunction.calculate(10));
    }
}
