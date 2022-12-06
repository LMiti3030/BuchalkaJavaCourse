package mititelu.laura;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Exercise25FlourPackProblemTest {

    @ParameterizedTest
    @CsvSource({"1,0,4,false", "1,0,5,true", "0,5,4, true", "2,2,11, true", "-3,2,12, false", "5,3,24, false", "2,1,5, true"})
    void shouldReturnCorrectResultWhenCanPack(Integer bC, Integer sC, Integer g, Boolean result) {
        //given
        int bigCount = bC;
        int smallCount = sC;
        int goal = g;
        boolean expected = result;

        //when
        boolean actual = Exercise25FlourPackProblem.canPack(bigCount, smallCount, goal);

        //should
        assertEquals(expected, actual);
    }
}