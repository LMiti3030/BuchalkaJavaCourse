package mititelu.laura.methodchallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static mititelu.laura.methodchallenge.SecondsAndMinutesChallenge.getDurationString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondsAndMinutesChallengeTest {

    @Test
    public void getDurationStringTest(){
        Assertions.assertEquals("1h 16m 9s", getDurationString(4569));

        Assertions.assertEquals("Seconds should be greater than 0. Actual value received: -50", getDurationString(-50));

        Assertions.assertEquals("Minutes should be greater than 0. Actual value received: -20", getDurationString(-20,3));

        Assertions.assertEquals("Seconds should be between 0 and 59. Actual value received: 303", getDurationString(5,303));
    }

}
