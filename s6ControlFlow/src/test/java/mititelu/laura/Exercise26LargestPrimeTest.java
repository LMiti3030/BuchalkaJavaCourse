package mititelu.laura;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise26LargestPrimeTest {

    @ParameterizedTest
    @CsvSource({"21,7", "217,31", "0,-1", "1,-1", "45,5", "-1,-1", "7,7"})
    void getLargestPrime(Integer number, Integer result) {
        int no = number;
        int expected = result;

        int actual = Exercise26LargestPrime.getLargestPrime(no);

        assertEquals(expected, actual);
    }
}