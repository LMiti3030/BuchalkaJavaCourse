package mititelu.laura.switchex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraditionalSwitchChallengeTest {

    @Test
    public void getNatoAlphabetUsingTraditionalSwitchTest(){
        assertEquals("Charlie", TraditionalSwitchChallenge.getNatoAlphabetUsingTraditionalSwitch('c'));
        assertEquals("Dog", TraditionalSwitchChallenge.getNatoAlphabetUsingTraditionalSwitch('D'));
        assertEquals("z not found", TraditionalSwitchChallenge.getNatoAlphabetUsingTraditionalSwitch('z'));
    }
}
