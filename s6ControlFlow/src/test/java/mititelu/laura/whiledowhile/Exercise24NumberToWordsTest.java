package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise24NumberToWordsTest {


    @ParameterizedTest
    @CsvSource({"-121, -121", "1212, 2121", "1234, 4321", "100, 1"})
    void shouldReturnCorrectResultWhenReverse(Integer no, Integer result) {
        int number = no;
        int expected = result;

        int actual = Exercise24NumberToWords.reverse(number);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"100,3", "1,1","0,1", "11,2"})
    void shouldReturnCorrectResultWhenGetDigitCount(Integer no, Integer result) {
        int number = no;
        int expected = result;

        int actual = Exercise24NumberToWords.getDigitCount(number);

        assertEquals(expected, actual);
    }
}