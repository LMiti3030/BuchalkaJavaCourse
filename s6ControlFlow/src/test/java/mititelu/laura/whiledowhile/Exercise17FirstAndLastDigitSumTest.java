package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example input/output
 *  * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 *  * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 *  * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
 *  * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
 *  * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 */

class Exercise17FirstAndLastDigitSumTest {

    @ParameterizedTest
    @CsvSource({"252,4", "257,9", "0,0", "5,10", "-10,-1" })
    void shouldReturnCorrectNumberWhenSumFirstAndLastDigit(Integer num, Integer result) {
        //given
        int number = num;
        int expected = result;

        //when
        int actual = Exercise17FirstAndLastDigitSum.sumFirstAndLastDigit(number);

        //then
        assertEquals(expected,actual);
    }
}