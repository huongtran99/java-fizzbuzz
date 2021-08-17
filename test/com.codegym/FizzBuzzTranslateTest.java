package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void showFizzBuzzNumber1() {
        String expected = "1";
        String actual = FizzBuzzTranslate.showFizzBuzz(1);
        assertEquals(expected, actual);
    }

    @Test
    void showFizzBuzzNumber3() {
        String expected = "FIZZ";
        String actual = FizzBuzzTranslate.showFizzBuzz(3);
        assertEquals(expected, actual);
    }

    @Test
    void showFizzBuzzNumber4() {
        String expected = "4";
        String actual = FizzBuzzTranslate.showFizzBuzz(4);
        assertEquals(expected, actual);
    }

    @Test
    void showFizzBuzzNumber5() {
        String expected = "BUZZ";
        String actual = FizzBuzzTranslate.showFizzBuzz(5);
        assertEquals(expected, actual);
    }

    @Test
    void showFizzBuzzNumber15() {
        String expected = "FIZZBUZZ";
        String actual = FizzBuzzTranslate.showFizzBuzz(15);
        assertEquals(expected, actual);
    }

    @Test
    void showFizzBuzzNumber30() {
        String expected = "FIZZBUZZ";
        String actual = FizzBuzzTranslate.showFizzBuzz(30);
        assertEquals(expected, actual);
    }
}