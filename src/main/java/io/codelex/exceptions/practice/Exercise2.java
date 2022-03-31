package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {

        methodA();
    }

    public static void methodA() {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }

    }

    public static void methodB() {
        try {
            methodC();
        } catch (ArithmeticException e) {
            throw (e);
        }
    }

    public static void methodC() {

        int a = 5;
        int c = 0;
        try {
            int b = a / c;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Arithmetic mistake at " +
                    e.getStackTrace()[1].getClassName() + "/" +
                    e.getStackTrace()[0].getMethodName() +
                    "\nArithmetic mistake divide " + e.getMessage());
        }
    }
}
