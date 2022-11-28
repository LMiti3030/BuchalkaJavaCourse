package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise7EqualSumCheckerTest {

    @ParameterizedTest
    @CsvSource({"1,1,1,false", "1,1,2,true", "1,-1,0,true"})
    void should_ReturnCorrectValue_When_HasEqualSum(Integer firstNo, Integer secondNo, Integer result, Boolean eval){
        //given
        int first = firstNo;
        int second = secondNo;
        int third = result;
        boolean expected = eval;

        //when
        boolean actual = Exercise7EqualSumChecker.hasEqualSum(first, second, third);

        //then
        assertEquals(expected, actual);
    }
}
