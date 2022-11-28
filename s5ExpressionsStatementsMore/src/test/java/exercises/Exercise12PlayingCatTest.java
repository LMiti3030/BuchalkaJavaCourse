package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise12PlayingCatTest {

    @ParameterizedTest
    @CsvSource({ "true,10","false,36","true,46"})
    void should_ReturnFalse_when_isCatPlaying(Boolean isSummer, Integer temperature){
        //given
        boolean isSum = isSummer;
        int temp = temperature;

        //when

        boolean actual = Exercise12PlayingCat.isCatPlaying(isSum, temperature);

        //then
        assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource({ "false,30","true,36", "true, 26"})
    void should_ReturnTrue_when_isCatPlaying(Boolean isSummer, Integer temperature){
        //given
        boolean isSum = isSummer;
        int temp = temperature;

        //when

        boolean actual = Exercise12PlayingCat.isCatPlaying(isSum, temperature);

        //then
        assertTrue(actual);
    }

}
