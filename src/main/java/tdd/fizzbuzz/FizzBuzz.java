package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int number){

        String resultStr = "";

        if(number%15 == 0){
            resultStr = "FizzBuzz";
        } else if (number%3 == 0){
            resultStr = "Fizz";
        } else if (number%5 == 0) {
            resultStr = "Buzz";
        } else {
            resultStr = String.valueOf(number);
        }
        return resultStr;
    }
}
