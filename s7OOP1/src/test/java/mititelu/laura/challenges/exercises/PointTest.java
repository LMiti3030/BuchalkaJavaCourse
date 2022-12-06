package mititelu.laura.challenges.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void shouldReturnCorrectValueWhenDistanceNoArg() {
        Point first =new Point(6,5);
        double expected = 7.810249675906654;
        double actual = first.distance();
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnCorrectValueWhenDistancePointArg() {
        Point first =new Point(6,5);
        Point second = new Point(3,1);
        double expected = 5.0;
        double actual = first.distance(second);
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnCorrectValueWhenDistanceIntArgs() {
        Point first =new Point(6,5);
        double expected = 5.0;
        double actual = first.distance(2,2);
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnCorrectValueWhenDistanceConstructorNoArgs() {
        Point point =new Point();
        double expected = 0.0;
        double actual = point.distance();
        assertEquals(expected,actual);
    }
}