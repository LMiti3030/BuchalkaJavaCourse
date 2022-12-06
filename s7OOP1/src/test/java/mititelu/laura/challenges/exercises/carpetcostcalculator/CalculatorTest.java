package mititelu.laura.challenges.exercises.carpetcostcalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"3.5,2.75,4.0,38.5", "1.5,5.4,4.5,36.45"})
    void getTotalCost(Double cost, Double width, Double length, Double result) {
        Carpet carpet = new Carpet(cost);
        Floor floor = new Floor(width, length);
        Calculator calculator = new Calculator(floor, carpet);
        double expected = result;
        double actual = calculator.getTotalCost();
        assertEquals(expected, actual);

    }
}