package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise2SpeedConverterTest {

    @ParameterizedTest(name = "km={0} -> miles={1}")
    @CsvSource({"1.5,1", "10.25,6", "-5.6,-1", "25.42,16", "75.114,47"})
    void should_ReturnCorrectValue_When_ToMilesPerHour( Double km, Long result){
        //given
        double kilometers = km;
        long expected = result;

        //when
        long actual = Exercise2SpeedConverter.toMilesPerHour(km);

        //then
        assertEquals(expected, actual);
    }

}
