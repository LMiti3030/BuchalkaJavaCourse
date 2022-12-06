package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 getEvenDigitSum(-22); → should return -1 since the number is negative
 */

class Exercise18EvenDigitSumTest {

    @ParameterizedTest
    @CsvSource({"123456789,20", "252,4", "-22,-1", "2,2", "1,0", "0,0"})
    void shouldReturnCorrectValueWhenGetEvenDigitSum(Integer no, Integer result){
        //given
        int number = no;
        int expected = result;

        //when
        int actual = Exercise18EvenDigitSum.getEvenDigitSum(number);

        //then
        assertEquals(expected, actual);
    }

}