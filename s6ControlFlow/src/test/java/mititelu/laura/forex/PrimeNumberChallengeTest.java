package mititelu.laura.forex;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberChallengeTest {

    @Test
    public void isPrimeTest(){
        assertTrue(PrimeNumberChallenge.isPrime(2));
        assertFalse(PrimeNumberChallenge.isPrime(0));
        assertFalse(PrimeNumberChallenge.isPrime(8));
        assertTrue(PrimeNumberChallenge.isPrime(17));
        assertTrue(PrimeNumberChallenge.isPrime(37));
        assertFalse(PrimeNumberChallenge.isPrime(39));
    }

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor)); //reassigns the output to our captor
    }

    @Test
    public void printFirstThreePrimeNumbers(){
        PrimeNumberChallenge.printFirstThreePrimeNumbers();
        assertEquals("101\r\n103\r\n107", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut); //revert to standard output
    }

}
