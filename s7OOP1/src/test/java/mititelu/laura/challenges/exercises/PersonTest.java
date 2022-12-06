package mititelu.laura.challenges.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUP(){
        person = new Person();
    }

    @Test
    void shouldReturnTrueWhenIsTeenAge13() {
        person.setAge(13);

        assertTrue(person.isTeen());
    }

    @Test
    void shouldReturnFalseWhenIsTeenAge12() {
        person.setAge(12);

        assertFalse(person.isTeen());
    }

    @Test
    void shouldReturnFalseWhenIsTeenAge20() {
        person.setAge(20);

        assertFalse(person.isTeen());
    }

    @Test
    void shouldReturnTrueWhenIsTeenAge19() {
        person.setAge(19);

        assertTrue(person.isTeen());
    }

    @Test
    void shouldReturn0WhenSetAgeNegative(){
        person.setAge(-2);
        int expected = 0;
        int actual = person.getAge();
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturn0WhenSetAgeAbove100(){
        person.setAge(-102);
        int expected = 0;
        int actual = person.getAge();
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnFirstNameWhenGetFullNameLastNameNull() {
        person.setFirstName("Ana");
        String expected = "Ana";
        String actual = person.getFullName();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnLastNameWhenGetFullNameFirstNameNull() {
        person.setLastName("Popescu");
        String expected = "Popescu";
        String actual = person.getFullName();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnEmptyStringWhenGetFullNameEmptyNames() {
        person.setLastName("");
        person.setFirstName("");
        String expected = "";
        String actual = person.getFullName();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnEmptyStringWhenGetFullNameNamesNull() {
        String expected = "";
        String actual = person.getFullName();
        assertEquals(expected, actual);
    }


    @Test
    void shouldReturnFirstNameWhenGetFullNameEmptyLastName() {
        person.setFirstName("Ana");
        person.setLastName("");
        String expected = "Ana";
        String actual = person.getFullName();
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnLastNameWhenGetFullNameEmptyFirstName() {
        person.setFirstName("");
        person.setLastName("Popescu");
        String expected = "Popescu";
        String actual = person.getFullName();
        assertEquals(expected, actual);
    }

}