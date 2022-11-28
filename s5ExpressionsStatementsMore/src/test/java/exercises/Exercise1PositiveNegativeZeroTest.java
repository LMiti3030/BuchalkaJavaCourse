package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise1PositiveNegativeZeroTest {

    @ParameterizedTest(name = "number = {0}, result ={1}")
    @CsvSource({"-5,negative", "0,zero", "12,positive"})
    void should_ReturnCorrectString_When_CheckNumber(Integer no, String result){
        //given
        int number = no;
        String expected = result;

        //when
        String actual = Exercise1PositiveNegativeZero.checkNumberForUnitTesting(number);

        //then
        assertEquals(expected, actual);
    }

}
