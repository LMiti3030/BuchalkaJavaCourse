package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
 * isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
 * isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
 * isPerfectNumber(-1); should return false since the number is < 1
 */

class Exercise23PerfectNumberTest {

    @ParameterizedTest
    @CsvSource({"6,true", "28, true", "5, false", "-1, false"})
    void shouldReturnCorrectResultWhenIsPerfectNumber(Integer a, Boolean result) {

        int number = a;
        boolean expected = result;

        boolean actual = Exercise23PerfectNumber.isPerfectNumber(number);

        assertEquals(expected, actual);

    }
}