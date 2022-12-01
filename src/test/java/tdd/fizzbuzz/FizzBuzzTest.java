package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz mFizzBuzz = new FizzBuzz();

    @Test
    public void given1_whenCountOff_thenShouldReturn1() {
        String actual = mFizzBuzz.countOff(1);

        assertEquals(actual, "1");
    }
    @Test
    public void given3_whenCountOff_thenShouldReturnFizz() {
        String actual = mFizzBuzz.countOff(3);

        assertEquals(actual, "Fizz");
    }

}
