package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise8TeenNumberCheckerTest {

    @ParameterizedTest
    @CsvSource({"9,false", "13,true", "19,true", "17,true"})
    void should_ReturnCorrectValue_When_isTeen(Integer age, Boolean eval){
        //given
        int number = age;

        boolean expected = eval;

        //when
        boolean actual = Exercise8TeenNumberChecker.isTeen(age);

        //then
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"9,99,19,true", "23,15,42,true", "22,23,34,false"})
    void should_ReturnCorrectValue_When_hasTeen(Integer first, Integer second, Integer third, Boolean eval){
        //given
        int firstAge = first;
        int secondAge = second;
        int thirdAge = third;

        boolean expected = eval;

        //when
        boolean actual = Exercise8TeenNumberChecker.hasTeen(firstAge, secondAge, thirdAge);

        //then
        assertEquals(expected, actual);
    }


}
