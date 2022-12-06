package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
 * getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
 * getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
 * getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder
 */

class Ex22GreatestCommonDivisorTest {


    @ParameterizedTest
    @CsvSource({"25,15,5", "12,30,6", "9,18,-1", "81,153,9"})
    void getGreatestCommonDivisor(Integer a, Integer b, Integer result) {
        int first = a;
        int second = b;
        int expected = result;

        int actual = Ex22GreatestCommonDivisor.getGreatestCommonDivisor(first, second);

        assertEquals(expected,actual);

    }
}