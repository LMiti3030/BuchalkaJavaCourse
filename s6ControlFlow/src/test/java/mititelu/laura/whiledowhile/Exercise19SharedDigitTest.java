package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 *
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 *
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 *
 */

class Exercise19SharedDigitTest {


    @ParameterizedTest
    @CsvSource({"12,23,true", "9,99,false", "13,29,false", "15,55,true"})
    void shouldReturnCorrectValueWhenHasSharedDigit(Integer a, Integer b, Boolean result) {
        int first = a;
        int second = b;
        boolean expected = result;

        boolean actual = Exercise19SharedDigit.hasSharedDigit(first,second);

        assertEquals(expected, actual);

    }
}