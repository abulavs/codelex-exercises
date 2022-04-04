package io.codelex.java_advanced_test.Exercise3;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Joiner<T> {

    private final String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    String result;

    public String join(T... values) {
        List<String> listOfValues = Stream.of(values).map(Objects::toString).toList();
        String result = String.join(seperator, listOfValues);
        this.result = result;
        return result;
    }

    @Override
    public String toString() {
        return result;
    }
}
