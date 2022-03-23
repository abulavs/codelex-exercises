package io.codelex.fibenacci;

import io.codelex.fibinacci.FibibenaciSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibibenaciSequenceTest {
    @Test
    void testFirstNumbers() {
        //given
        FibibenaciSequence seqvence = new FibibenaciSequence();
        int firstNumberToGet = 1;
        int secondNumberToGet = 2;
        int thirdNumberToGet = 3;
        int fourthNumberToGet = 5;


        int exeptedFirst = 0;
        int exeptedSecond = 1;
        int exeptedThird = 1;
        int exeptedForth = 3;

        //when
        Assertions.assertEquals(exeptedFirst, seqvence.getNumber(firstNumberToGet));
        Assertions.assertEquals(exeptedSecond, seqvence.getNumber(secondNumberToGet));
        Assertions.assertEquals(exeptedThird, seqvence.getNumber(thirdNumberToGet));
        Assertions.assertEquals(exeptedForth, seqvence.getNumber(fourthNumberToGet));
    }

    @Test
    void testLaterNumber() {
        FibibenaciSequence seqvence = new FibibenaciSequence();
        Assertions.assertEquals(55, seqvence.getNumber(11));
        Assertions.assertEquals(89, seqvence.getNumber(12));
        Assertions.assertEquals(144, seqvence.getNumber(13));
    }

    @Test
    void testIncorrectInput() {
        FibibenaciSequence seqvence = new FibibenaciSequence();
        Exception e = Assertions.assertThrows(IllegalArgumentException.class, () -> seqvence.getNumber(-3));
        Assertions.assertEquals("  ", e.getMessage());
    }

}

