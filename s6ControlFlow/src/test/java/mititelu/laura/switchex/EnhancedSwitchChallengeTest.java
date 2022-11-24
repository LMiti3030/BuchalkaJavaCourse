package mititelu.laura.switchex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnhancedSwitchChallengeTest {

    @Test
    public void getDayOfWeekTest(){
        assertEquals("Monday", EnhancedSwitchChallenge.getDayOfWeek(1));
        assertEquals("Invalid day", EnhancedSwitchChallenge.getDayOfWeek(-1));
        assertEquals("Invalid day", EnhancedSwitchChallenge.getDayOfWeek(7));
    }
}
