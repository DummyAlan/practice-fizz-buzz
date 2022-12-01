package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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
    void given15_whenCountOff_thenShouldReturnFizzBuzz() {
        String actual = mFizzBuzz.countOff(15);

        assertEquals("FizzBuzz", actual);
    }



}
