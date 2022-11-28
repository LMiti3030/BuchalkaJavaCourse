package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise6DecimalComparatorTest {

    @ParameterizedTest
    @CsvSource({"-3.1756,-3.175,true", "3.175,3.176,false", "3.0,3.0,true", "-3.123,3.123,false"})
    void should_ReturnCorrectValue_When_AreEqualByThreeDecimalPlaces(Double firstNo, Double secondNo, Boolean result){
        //given
        double first = firstNo;
        double second = secondNo;
        boolean expected = result;

        //when
        boolean actual = Exercise6DecimalComparator.areEqualByThreeDecimalPlaces(first,second);

        //then
        assertEquals(expected, actual);
    }
}
