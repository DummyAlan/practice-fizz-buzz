package tdd.fizzbuzz;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    enum DENOMINATORS {
        FIZZ(3, "Fizz"),
        BUZZ(5, "Buzz"),
        WHIZZ(7, "Whizz");

        private int denominator;

        private String countOffString;

        DENOMINATORS(int denominator, String countOffString) {
            this.denominator = denominator;
            this.countOffString = countOffString;
        }
    }


    public String countOff(int number) {

        String result = Arrays
                .stream(DENOMINATORS.values())
                .map(denom -> handleNumber(number, denom))
                .collect(Collectors.joining());

        return result.isEmpty() ? String.valueOf(number) : result;
    }

    private String handleNumber(int number, DENOMINATORS denom) {
        return number % denom.denominator == 0 ? denom.countOffString : "";
    }
}
