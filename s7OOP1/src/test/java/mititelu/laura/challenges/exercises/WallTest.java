package mititelu.laura.challenges.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WallTest {

    private Wall wall;

    @BeforeEach
    void setUp(){
        wall = new Wall();
    }

    @Test
    void shouldReturnOWhenSetHeightNegative(){
        wall.setHeight(-95);
        double expected = 0.0;
        double actual = wall.getHeight();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOWhenSetWidthNegative(){
        wall.setWidth(-95);
        double expected = 0.0;
        double actual = wall.getWidth();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOWhenCreateNewWallWithNegativeValues(){
       wall = new Wall(-20, -15);
        double expectedHeight = 0.0;
        double expectedWidth = 0.0;
        double actualWidth = wall.getWidth();
        double actualHeight = wall.getHeight();
        assertAll(
                ()-> assertEquals(expectedHeight, actualHeight),
                () -> assertEquals(expectedWidth, actualWidth)
        );

    }


    @Test
    void getArea() {
        wall = new Wall(12, 20);
        double expected = 240;
        double actual = wall.getArea();
        assertEquals(expected, actual);

    }
}