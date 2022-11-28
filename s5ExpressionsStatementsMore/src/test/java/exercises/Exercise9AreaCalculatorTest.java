package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise9AreaCalculatorTest {

    @ParameterizedTest
    @CsvSource({"5.0,78.53975", "-1,-1"})
    void shouldReturnCorrectAreaWhenAreaSingleParam(Double radius, Double result){
        //given
        double value = radius;
        double expected = result;

        //when
        double actual = Exercise9AreaCalculator.area(radius);

        //then
        assertEquals(expected,actual);
    }


    @ParameterizedTest
    @CsvSource({"5.0,4.0,20,0", "-1.0,4.0,-1"})
    void shouldReturnCorrectAreaWhenAreaDualParam(Double xValue, Double yValue, Double result){
        //given
        double x = xValue;
        double y = yValue;
        double expected = result;

        //when
        double actual = Exercise9AreaCalculator.area(x,y);

        //then
        assertEquals(expected,actual);
    }
}
