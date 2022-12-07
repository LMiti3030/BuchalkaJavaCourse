package mititelu.laura.challenges.exercises.poolarea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getArea() {

        Rectangle rectangle = new Rectangle(5,10);
        double expected = 50.0;

        double actual = rectangle.getArea();

        assertEquals(expected, actual);

    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(5,10);
        double expected = 5.0;

        double actual = rectangle.getWidth();

        assertEquals(expected, actual);

    }

    @Test
    void getLength() {

        Rectangle rectangle = new Rectangle(5,10);
        double expected = 10.0;

        double actual = rectangle.getLength();

        assertEquals(expected, actual);

    }
}