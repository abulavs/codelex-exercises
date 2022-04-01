package io.codelex.java_advanced_test.Exercise3;

public class Joiner<T> {

    private final T value;

    public Joiner(T value) {
        this.value = value;
    }

    public String join(T value) {
        String seperator = "-";
        String result = "";
        String[] arr = String.valueOf(value).split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += arr[i] + seperator;
            }

        }
        return result;
    }

    @Override
    public String toString() {
        return join(value);
    }
}
