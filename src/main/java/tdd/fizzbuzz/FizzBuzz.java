package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number){

        String resultStr = "";

        if (number%3 == 0){
            resultStr = "Fizz";
        }
        else {
            resultStr = String.valueOf(number);
        }
        return resultStr;
    }
}
