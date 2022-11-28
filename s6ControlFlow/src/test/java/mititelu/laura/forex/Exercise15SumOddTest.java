package mititelu.laura.forex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise15SumOddTest {

    @ParameterizedTest
    @CsvSource({"1,100,2500", "-1,100,-1", "100,100,0", "13,13,13","100,-100,-1", "100,1000,247500" })
    void shouldReturnCorrectSumWhenSumOdd(Integer s, Integer e, Integer result){
        //given
        int start = s;
        int end = e;
        int expected = result;

        //when
        int actual = Exercise15SumOdd.sumOdd(s,e);

        //then
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"1,100,2500", "-1,100,-1", "100,100,0", "13,13,13","100,-100,-1", "100,1000,247500" })
    void shouldReturnCorrectSumWhenSumOddUsingStreams(Integer s, Integer e, Integer result){
        //given
        int start = s;
        int end = e;
        int expected = result;

        //when
        int actual = Exercise15SumOdd.sumOddUsingStreams(start,end);

        //then
        assertEquals(expected,actual);
    }

}
