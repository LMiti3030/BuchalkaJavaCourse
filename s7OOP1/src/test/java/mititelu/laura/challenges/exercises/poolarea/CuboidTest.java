package mititelu.laura.challenges.exercises.poolarea;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CuboidTest {

    private static Cuboid cuboid;

    @BeforeAll
    static void setCuboid(){
        cuboid = new Cuboid(5,10,5);
    }

    @Test
    void getArea() {

        double expected = 50.0;

        double actual = cuboid.getArea();

        assertEquals(expected, actual);

    }

    @Test
    void getWidth() {


        double expected = 5.0;

        double actual = cuboid.getWidth();

        assertEquals(expected, actual);

    }

    @Test
    void getLength() {


        double expected = 10.0;

        double actual = cuboid.getLength();

        assertEquals(expected, actual);

    }

    @Test
    void getVolume() {


        double expected = 250.0;

        double actual = cuboid.getVolume();

        assertEquals(expected, actual);

    }

    @Test
    void getHeight() {


        double expected = 5.0;

        double actual = cuboid.getHeight();

        assertEquals(expected, actual);
    }
}