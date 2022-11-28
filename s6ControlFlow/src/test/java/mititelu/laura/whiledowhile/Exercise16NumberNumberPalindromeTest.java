package mititelu.laura.whiledowhile;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise16NumberNumberPalindromeTest {

    @ParameterizedTest
    @CsvSource({"-1221,true", "707,true", "11212,false" })
    void shouldReturnCorrectResultWhenIsPalindrome(Integer n, Boolean result){
        //given
        int number = n;
        boolean expected = result;

        //when
        boolean actual = Exercise16NumberNumberPalindrome.isPalindrome(n);

        //then
        assertEquals(expected,actual);
    }
}
