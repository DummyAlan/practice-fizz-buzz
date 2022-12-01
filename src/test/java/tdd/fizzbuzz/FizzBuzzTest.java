package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz mFizzBuzz = new FizzBuzz();

    @Test
    void given1_whenCountOff_thenShouldReturn1() {
        String actual = mFizzBuzz.countOff(1);

        assertEquals("1", actual);
    }
    @Test
    void given3_whenCountOff_thenShouldReturnFizz() {
        String actual = mFizzBuzz.countOff(3);

        assertEquals("Fizz", actual);
    }

    @Test
    void given5_whenCountOff_thenShouldReturnBuzz() {
        String actual = mFizzBuzz.countOff(5);

        assertEquals("Buzz", actual);
    }

    @Test
    void given7_whenCountOff_thenShouldReturnWhizz() {
        String actual = mFizzBuzz.countOff(7);

        assertEquals("Whizz", actual);
    }
    @Test
    void given15_whenCountOff_thenShouldReturnFizzBuzz() {
        String actual = mFizzBuzz.countOff(15);

        assertEquals("FizzBuzz", actual);
    }

    @Test
    void given35_whenCountOff_thenShouldReturnBuzzWhizz() {
        String actual = mFizzBuzz.countOff(35);

        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void given21_whenCountOff_thenShouldReturnFizzWhizz() {
        String actual = mFizzBuzz.countOff(21);

        assertEquals("FizzWhizz", actual);
    }

    @Test
    void given105_whenCountOff_thenShouldReturnFizzBuzzWhizz() {
        String actual = mFizzBuzz.countOff(105);

        assertEquals("FizzBuzzWhizz", actual);
    }





}
