package mititelu.laura.challenges.exercises.cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getArea() {
        Cylinder cylinder = new Cylinder(5.55,7.25);
        double expected = 96.76890771219959;

        double actual = cylinder.getArea();

        assertEquals(expected, actual);
    }

    @Test
    void getRadius() {
        Cylinder cylinder = new Cylinder(5.55,7.25);
        double expected = 5.55;

        double actual = cylinder.getRadius();

        assertEquals(expected, actual);
    }

    @Test
    void getVolume() {
        Cylinder cylinder = new Cylinder(5.55,7.25);
        double expected = 701.574580913447;

        double actual = cylinder.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void getHeight() {
        Cylinder cylinder = new Cylinder(5.55,7.25);
        double expected = 7.25;

        double actual = cylinder.getHeight();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0WhenGetVolumeHeightNegative() {
        Cylinder cylinder = new Cylinder(5.55,-7.25);
        double expected = 0;

        double actual = cylinder.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0WhenGetHeightHeightNegative() {
        Cylinder cylinder = new Cylinder(5.55,-7.25);
        double expected = 0;

        double actual = cylinder.getHeight();

        assertEquals(expected, actual);
    }
}