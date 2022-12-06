package mititelu.laura.challenges.exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    private static SimpleCalculator calculator;

    @BeforeAll
    static void  setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    void getAdditionResult() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        double expected = 9.0;
        double actual = calculator.getAdditionResult();
        assertEquals(expected,actual);
    }

    @Test
    void getSubtractionResult() {
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        double expected = 1.0;
        double actual = calculator.getSubtractionResult();
        assertEquals(expected,actual);
    }

    @Test
    void getMultiplicationResult() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        double expected = 0;
        double actual = calculator.getMultiplicationResult();
        assertEquals(expected,actual);
    }

    @Test
    void getDivisionResult() {
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        double expected = 0;
        double actual = calculator.getDivisionResult();
        assertEquals(expected,actual);
    }


}