package mititelu.laura.challenges.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexNumberTest {

    @Test
    void shouldReturnCorrectValueWhenAdd2Params() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);

        double expectedReal = 2.0;
        double expectedImaginary= 2.0;

        one.add(1,1);
        double actualReal = one.getReal();
        double actualImaginary = one.getImaginary();

        assertAll(() -> assertEquals(expectedReal,actualReal),
                () -> assertEquals(expectedImaginary, actualImaginary));
    }

    @Test
    void shouldReturnCorrectValueWhenAdd1Param() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);

        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        double expectedReal = 3.5;
        double expectedImaginary= -0.5;

        one.add(number);
        double actualReal = one.getReal();
        double actualImaginary = one.getImaginary();

        assertAll(() -> assertEquals(expectedReal,actualReal),
                () -> assertEquals(expectedImaginary, actualImaginary));
    }

    @Test
    void shouldReturnCorrectValueWhenSubtract1Param() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);

        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        double expectedReal = -1.5;
        double expectedImaginary= 2.5;

        one.subtract(number);
        double actualReal = one.getReal();
        double actualImaginary = one.getImaginary();

        assertAll(() -> assertEquals(expectedReal,actualReal),
                () -> assertEquals(expectedImaginary, actualImaginary));
    }

    @Test
    void shouldReturnCorrectValueWhenSubtract2Params() {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);

        double expectedReal = 0.4;
        double expectedImaginary= -2.2;

        one.subtract(0.6,3.2);
        double actualReal = one.getReal();
        double actualImaginary = one.getImaginary();

        assertAll(() -> assertEquals(expectedReal,actualReal),
                () -> assertEquals(expectedImaginary, actualImaginary));

    }
}