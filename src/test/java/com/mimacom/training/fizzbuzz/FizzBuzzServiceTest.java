package com.mimacom.training.fizzbuzz;


import com.mimacom.training.fizzbuzz.api.FizzBuzzService;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzServiceTest {

    private FizzBuzzService fizzBuzzService;

    @Before
    public void setUp() throws Exception {
        fizzBuzzService = new FizzBuzzService();
    }

    @Test
    public void testFizzBuzz() throws Exception {
        /*List<String> result = fizzBuzzService.generate();
        assertThat(result)
                .containsSequence(
                        "1",
                        "2",
                        "Fizz",
                        "4",
                        "Buzz",
                        "6",
                        "7",
                        "8",
                        "9",
                        "FizzBuzz"
                );*/
    }
}