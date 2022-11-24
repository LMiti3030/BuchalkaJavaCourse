package mititelu.laura.methodchallenge;

import org.junit.jupiter.api.Test;

import static mititelu.laura.methodchallenge.MethodChallenge.calculateHighScorePosition;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MethodChallengeTest {

    @Test
    public void calculateHighScorePositionTest(){
        assertEquals(1,calculateHighScorePosition(1500));
        assertEquals(1,calculateHighScorePosition(1000));
        assertEquals(2,calculateHighScorePosition(500));
        assertEquals(3,calculateHighScorePosition(100));
        assertEquals(4,calculateHighScorePosition(25));
    }
}
