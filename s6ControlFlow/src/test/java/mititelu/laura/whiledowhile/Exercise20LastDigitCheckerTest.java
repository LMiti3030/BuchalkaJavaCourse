package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
 * hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
 * hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
 * isValid(10); → should return true since 10 is within the range of 10-1000
 * isValid(468); → should return true since 468 is within the range of 10-1000
 * isValid(1051); → should return false since 1051 is not within the range of 10-1000
 */


class Exercise20LastDigitCheckerTest {

    @ParameterizedTest
    @CsvSource({"41,22,71, true", "23,32,42, true", "9,99,999, false" })
    void shouldReturnCorrectResultWhenHasSameLastDigit(Integer a, Integer b, Integer c, Boolean result) {
        int first = a;
        int second = b;
        int third = c;
        boolean expected = result;

        boolean actual = Exercise20LastDigitChecker.hasSameLastDigit(first, second, third);

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({"10,true", "468, true", "1051, false"})
    void shouldReturnCorrectResultWhenIsValid(Integer no, Boolean result) {
        int number = no;
        boolean expected = result;

        boolean actual = Exercise20LastDigitChecker.isValid(number);

        assertEquals(expected,actual);
    }
}