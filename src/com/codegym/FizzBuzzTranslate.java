package com.codegym;

public class FizzBuzzTranslate {
    public static final String FIZZ = "FIZZ";
    public static final String BUZZ = "BUZZ";

    public static String showFizzBuzz(int number) {
        boolean isFizzNumber = number % 3 == 0;
        boolean isBuzzNumber = number % 5 == 0;
        if (isFizzNumber && isBuzzNumber) {
            return FIZZ + BUZZ;
        } else if (isFizzNumber) {
            return FIZZ;
        } else if (isBuzzNumber) {
            return BUZZ;
        }
        return number + "";
    }

}
