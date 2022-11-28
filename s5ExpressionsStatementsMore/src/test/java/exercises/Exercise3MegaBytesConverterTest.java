package exercises;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise3MegaBytesConverterTest {

    private static final PrintStream standardOut = System.out;
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); //reassigns the output to our captor
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(standardOut); //revert to standard output
    }

    @ParameterizedTest
    @CsvSource({"2500, 2500 KB = 2 MB and 452 KB", "-1024, Invalid Value", "5000, 5000KB = 4MB and 904 KB"})
    void should_PrintCorrectString_When_printMegaBytesAndKiloBytes(Integer noBytes, String result){
        //given
        int bytes = noBytes;
        String expected = result;

        //when
        Exercise3MegaBytesConverter.printMegaBytesAndKiloBytes(bytes);
        String actual = outputStreamCaptor.toString().trim();

        //then
        assertEquals(expected,actual);


    }


}
