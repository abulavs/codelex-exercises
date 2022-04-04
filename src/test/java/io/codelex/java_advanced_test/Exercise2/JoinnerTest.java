package io.codelex.java_advanced_test.Exercise2;

import io.codelex.java_advanced_test.Exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinnerTest {

    @Test
    void testString() {
        //given
        Joiner joiner = new Joiner("-");
        joiner.join(1, 2, 3, 4, 5, "a", "c", false);
        String firstExcepted = "1-2-3-4-5-a-c-false";

        Assertions.assertEquals(firstExcepted, joiner.toString());
    }

    @Test
    void testNumber() {
        //given
        Joiner joiner = new Joiner("^");
        joiner.join(123456, true, 10.3);
        String firstExcepted = "123456^true^10.3";
        Assertions.assertEquals(firstExcepted, joiner.toString());
    }

    @Test
    void testBoolean() {
        //given
        Joiner joiner = new Joiner("|");
        joiner.join(false, true, "true", "false");
        String firstExcepted = "false|true|true|false";
        Assertions.assertEquals(firstExcepted, joiner.toString());
    }
}