package io.codelex.java_advanced_test.Exercise2;

import io.codelex.java_advanced_test.Exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinnerTest {

    @Test
    void testString() {
        //given
        Joiner joiner = new Joiner("asdfgh");
        String firstExepted = "a-s-d-f-g-h";
        Assertions.assertEquals(firstExepted, joiner.toString());
    }

    @Test
    void testNumber() {
        //given
        Joiner joiner = new Joiner(123456);
        String firstExepted = "1-2-3-4-5-6";
        Assertions.assertEquals(firstExepted, joiner.toString());
    }

    @Test
    void testBoolean() {
        //given
        Joiner joiner = new Joiner(false);
        String firstExepted = "f-a-l-s-e";
        Assertions.assertEquals(firstExepted, joiner.toString());
    }
}