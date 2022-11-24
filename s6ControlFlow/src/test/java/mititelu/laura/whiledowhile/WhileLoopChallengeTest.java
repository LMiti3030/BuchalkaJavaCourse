package mititelu.laura.whiledowhile;

import mititelu.laura.forex.Sum3And5Challenge;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static mititelu.laura.whiledowhile.WhileLoopChallenge.printEvenNumbersFrom5To20;
import static mititelu.laura.whiledowhile.WhileLoopChallenge.printEvenNumbersFrom5To20UsingLambdas;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileLoopChallengeTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); //reassigns the output to our captor
    }

    @Test
    public void printEvenNumbersFrom5To20Test(){
        printEvenNumbersFrom5To20();
        assertEquals("6\r\n8\r\n10\r\n12\r\n14\r\n16\r\n18\r\n20", outputStreamCaptor.toString().trim());
    }


    @Test
    public void printEvenNumbersFrom5To20UsingLambdasTest(){
        printEvenNumbersFrom5To20UsingLambdas();
        assertEquals("6\r\n8\r\n10\r\n12\r\n14\r\n16\r\n18\r\n20", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut); //revert to standard output
    }
}
