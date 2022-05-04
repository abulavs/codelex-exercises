package io.codelex.java_advanced_test.Exercise1;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException(String errorMessage) {
        super(errorMessage);
    }
}
