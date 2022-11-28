package mititelu.laura.switchex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise14NumberOfDaysInMonthTest {

    @ParameterizedTest
    @CsvSource({"1,2020,31", "2,2020,29", "2,2018,28", "-1, 2020,-1","1,-2020,-1" })
    void shouldReturnCorrectNumberOfDaysWhenGetDaysInMonth(Integer m, Integer y, Integer result){
        //given
        int month = m;
        int year = y;
        int expected = result;

        //when
       Integer actual = Exercise14NumberOfDaysInMonth.getDaysInMonth(month,year);

        //then
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"1,2020,31", "2,2020,29", "2,2018,28", "-1, 2020,-1","1,-2020,-1" })
    void shouldReturnCorrectNumberOfDaysWhenGetDaysInMonthNewSwitch(Integer m, Integer y, Integer result){
        //given
        int month = m;
        int year = y;
        int expected = result;

        //when
        Integer actual = Exercise14NumberOfDaysInMonth.getDaysInMonthNewSwitch(month,year);

        //then
        assertEquals(expected,actual);
    }
}
