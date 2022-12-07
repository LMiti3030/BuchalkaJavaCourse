package mititelu.laura.challenges.exercises.cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle(3.75);
        double expected = 44.178646691106465;

        double actual = circle.getArea();

        assertEquals(expected, actual);


    }

    @Test
    void shouldReturn0WhenGetRadiusRadiusNegative() {
        Circle circle = new Circle(-2);
        double expected = 0;

        double actual = circle.getRadius();

        assertEquals(expected, actual);


    }

    @Test
    void shouldReturn0WhenGetAreasRadiusNegative() {
        Circle circle = new Circle(-5);
        double expected = 0;

        double actual = circle.getArea();

        assertEquals(expected, actual);


    }

    @Test
    void getRadius() {

        Circle circle = new Circle(3.75);
        double expected = 3.75;

        double actual = circle.getRadius();

        assertEquals(expected, actual);
    }
}