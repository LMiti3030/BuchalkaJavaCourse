package mititelu.laura.methodchallenge;

import org.junit.jupiter.api.Test;

import static mititelu.laura.methodchallenge.MethodOverloadingChallenge.convertToCentimeters;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodOverloadingChallengeTest {

    //metodele statice nu pot fi folosite ca test
    @Test
    public void convertToCentimeters1ParamTest(){
        assertEquals(12.7, convertToCentimeters(5));
        assertEquals(172.72, convertToCentimeters(68));
    }

    @Test
    public void convertToCentimeters2ParamsTest(){
        assertEquals(12.7, convertToCentimeters(0, 5));
        assertEquals(43.18, convertToCentimeters(1, 5));
        assertEquals(182.88, convertToCentimeters(6, 0));
        assertEquals(172.72, convertToCentimeters(5,8));
    }
}
