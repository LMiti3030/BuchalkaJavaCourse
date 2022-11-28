package mititelu.laura.switchex;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise13NumberInWordTest {

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

    @ParameterizedTest
    @CsvSource({"0,ZERO", "1,ONE", "-1,OTHER", "2, TWO","3,THREE", "4,FOUR", "5,FIVE", "6,SIX", "7,SEVEN", "8,EIGHT", "9,NINE" })
    void shouldPrintCorrectlyWhenPrintNumberInWord(Integer number, String result){
        //given
        int no = number;
        String expected = result;

        //when
        Exercise13NumberInWord.printNumberInWord(no);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({"0,ZERO", "1,ONE", "-1,OTHER", "2, TWO","3,THREE", "4,FOUR", "5,FIVE", "6,SIX", "7,SEVEN", "8,EIGHT", "9,NINE" })
    void shouldPrintCorrectlyWhenPrintNumberInWordOldSwitch(Integer number, String result){
        //given
        int no = number;
        String expected = result;

        //when
        Exercise13NumberInWord.printNumberInWordOldSwitch(no);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }
}
