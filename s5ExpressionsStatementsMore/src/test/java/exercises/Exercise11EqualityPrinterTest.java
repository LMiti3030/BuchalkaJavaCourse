package exercises;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise11EqualityPrinterTest {

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
    @CsvSource({"1,1,1,All numbers are equal", "1,1,2, Neither all are equal or different", "-1,1,2, Invalid Value", "1,2,3,All numbers are different",
            "1,2,2, Neither all are equal or different", "1,2,1, Neither all are equal or different"})
    void shouldReturnCorrectAreaWhenAreaSingleParam(Integer param1, Integer param2, Integer param3, String result){
        //given
        int i1 = param1;
        int i2 = param2;
        int i3 = param3;
        String expected = result;

        //when
        Exercise11EqualityPrinter.printEqual(i1, i2, i3);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);
    }


}
