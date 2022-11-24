package mititelu.laura.whiledowhile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumChallengeTest {

    @Test
    public void sumDigitsTest(){
        assertEquals(-1, DigitSumChallenge.sumDigits(-20));
        assertEquals(3, DigitSumChallenge.sumDigits(120));
        assertEquals(16, DigitSumChallenge.sumDigits(18520));
        assertEquals(4, DigitSumChallenge.sumDigits(4));
        assertEquals(0, DigitSumChallenge.sumDigits(0));
    }
}
