package mititelu.laura.switchex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exemplu1Test {

    @Test
    public void getQuarterTest(){
        assertEquals("1st", Exemplu1.getQuarter("january"));
        assertEquals("2nd", Exemplu1.getQuarter("APRIL"));
        assertEquals("4th", Exemplu1.getQuarter("October"));
        assertEquals("Bombastic is bad", Exemplu1.getQuarter("Bombastic"));
    }
}
