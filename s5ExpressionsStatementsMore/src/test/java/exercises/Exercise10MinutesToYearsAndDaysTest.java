package exercises;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise10MinutesToYearsAndDaysTest {

    private static final PrintStream standardOut = System.out;
    private static ByteArrayOutputStream outputStreamCaptor ;

    @BeforeEach
    public void setUp() {
        outputStreamCaptor = new ByteArrayOutputStream(); //need to create a captor each time so that it retrieves each line separately
        System.setOut(new PrintStream(outputStreamCaptor)); //reassigns the output to our captor
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(standardOut); //revert to standard output
        System.out.flush();
    }

    @Test
    void should_PrintCorrectString_When_printYearsAndDays5256000(){
        //given
        long minutes = 525600;
        String expected = "525600 min = 1 y and 0 d";

        //when
        Exercise10MinutesToYearsAndDays.printYearsAndDays(minutes);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void should_PrintCorrectString_When_printYearsAndDays1024(){
        //given
        long minutes = -1024;
        String expected = "Invalid Value";

        //when
        Exercise10MinutesToYearsAndDays.printYearsAndDays(minutes);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void should_PrintCorrectString_When_printYearsAndDays561600(){
        //given
        long minutes = 561600;
        String expected = "561600 min = 1 y and 25 d";

        //when
        Exercise10MinutesToYearsAndDays.printYearsAndDays(minutes);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }

    @Test
    void should_PrintCorrectString_When_printYearsAndDays1051200(){
        //given
        long minutes = 1051200;
        String expected = "1051200 min = 2 y and 0 d";

        //when
        Exercise10MinutesToYearsAndDays.printYearsAndDays(minutes);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }
}
