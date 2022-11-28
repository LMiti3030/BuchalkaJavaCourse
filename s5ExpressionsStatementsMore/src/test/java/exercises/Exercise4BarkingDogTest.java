package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exercise4BarkingDogTest {

    @Test
    void should_ReturnTrue_When_ShouldWakeUP_DogBarkingAndHourOfDayBefore8OrAfter22(){
        //given
        boolean isBarking = true;
        int hourOfDay = 1;

        //when
        boolean actual = Exercise4BarkingDog.shouldWakeUp(isBarking,hourOfDay);

        //then
        assertTrue(actual);
    }

    @Test
    void should_ReturnFalse_When_ShouldWakeUP_DogNotBarkingAndHourOfDayBefore8OrAfter22(){
        //given
        boolean isBarking = false;
        int hourOfDay = 2;

        //when
        boolean actual = Exercise4BarkingDog.shouldWakeUp(isBarking,hourOfDay);

        //then
        assertFalse(actual);
    }

    @Test
    void should_ReturnFalse_When_ShouldWakeUP_DogBarkingAndHourOfDayAfter8AndBefore22(){
        //given
        boolean isBarking = true;
        int hourOfDay = 8;

        //when
        boolean actual = Exercise4BarkingDog.shouldWakeUp(isBarking,hourOfDay);

        //then
        assertFalse(actual);
    }

    @Test
    void should_ReturnFalse_When_ShouldWakeUP_DogBarkingAndHourOutsideRange(){
        //given
        boolean isBarking = true;
        int hourOfDay = -1;

        //when
        boolean actual = Exercise4BarkingDog.shouldWakeUp(isBarking,hourOfDay);

        //then
        assertFalse(actual);
    }

}
