package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise5LeapYearCalculatorTest {

    @ParameterizedTest
    @CsvSource({"-1600,false", "1600,true", "2017,false", "2000,true", "1924,true"})
    void should_ReturnCorrectValue_When_IsLeapYear(Integer year, Boolean result){
        //given
        int testYear = year;
        boolean expected = result;

        //when
        boolean actual = Exercise5LeapYearCalculator.isLeapYear(testYear);

        //then
        assertEquals(expected, actual);
    }


}
