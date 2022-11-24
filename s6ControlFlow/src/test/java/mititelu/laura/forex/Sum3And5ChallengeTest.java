package mititelu.laura.forex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum3And5ChallengeTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); //reassigns the output to our captor
    }

    @Test
    public void printSumAndFirstFiveNoDividedByBoth3And5Test(){
        Sum3And5Challenge.printSumAndFirstFiveNoDividedByBoth3And5();
        assertEquals("15\r\n30\r\n45\r\n60\r\n75\r\n225", outputStreamCaptor.toString().trim());
    }

    @Test
    public void printFirstFiveNoDividedByBoth3And5UsingLambdaTest(){
        Sum3And5Challenge.printFirstFiveNoDividedByBoth3And5UsingLambda();
        assertEquals("15\r\n30\r\n45\r\n60\r\n75\r\n225", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut); //revert to standard output
    }
}
